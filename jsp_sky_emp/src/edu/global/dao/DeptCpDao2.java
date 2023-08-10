package edu.global.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.global.dto.DeptDto;

public class DeptCpDao2 {
	
	//커넥션풀을 사용하기 위한 소스코드(Datasource를 import 할 시 java.sql로 해야 한다.
	private DataSource datasource;
	
	   public DeptCpDao2() {
		   //기존에 driver를 설정하고 Class.forName(driver)를 넣는 방식과 달리 context.xml에
		   //리소스를 설정해주었다. context.xml에 있는 소스를 읽기 위해 context객체 생성한다.
		   
		   //jdbc/oracle : context.xml에 들어간 Resource에서 name에 해당하는 부분
		   //위의 식은 context.xml에서 name을 lookup 찾으라는 뜻이다.
		   
		   try {
			   //context.xml 설정을 읽어들이는 객체
			   Context context = new InitialContext();
			   //oracle 이름 설정(개발자가 임의 설정)
			   datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	   }
	
	   public int deleteDept(int deptno) {
		      
		      Connection con = null;
		      PreparedStatement stmt = null;
		      String query = "delete from dept where deptno = ? "; 
		      int result = 0;
		      
		      try {
		         
		         con = datasource.getConnection();
		         stmt = con.prepareStatement(query);
		         
		         stmt.setInt(1, deptno);
		         
		         
		         result = stmt.executeUpdate();

		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         // ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
		         // 열었으므로 거꾸로 닫아준다.
		         try {
		            
		            if (stmt != null)
		               stmt.close();
		            if (con != null)
		               con.close();

		         } catch (Exception e2) {
		            e2.printStackTrace();
		         }
		      }

		      return result;

		   }
	   
	   
	   public int insertDept(int deptno, String dname, String loc) {
		      
		      Connection con = null;
		      PreparedStatement stmt = null;
		      String query = "insert into dept(deptno,dname,loc) values(?,?,?)"; 
		      int result = 0;
		      try {
		         
		         con = datasource.getConnection();
		         stmt = con.prepareStatement(query);
		         
		         stmt.setInt(1, deptno);
		         stmt.setString(2, dname);
		         stmt.setString(3, loc);
		         stmt.setString(4, name);
		         
		         
		         result = stmt.executeUpdate();

		      } catch (Exception e) {
		         e.printStackTrace();
		      } finally {
		         // ※제일 나중에 연거를 먼저 닫아줘야한다. Connection, Statement, ResultSet순서로
		         // 열었으므로 거꾸로 닫아준다.
		         try {
		            
		            if (stmt != null)
		               stmt.close();
		            if (con != null)
		               con.close();

		         } catch (Exception e2) {
		            e2.printStackTrace();
		         }
		      }

		      return result;

		   }
	   public List<DeptDto> getDepts(){
		   //메모리에 연속된방을 잡는 ArrayList를 리턴타입으로 설정해준다.
		   ArrayList<DeptDto> dtos = new ArrayList<DeptDto>();
		   
		   //Connection, Statement, ResultSte 3종세트를 순서대로 객체생성한다.
		   //이때 import 할시 java.sql에 있는 인터페이스를 가져와야 한다(주의)
		   Connection con = null;
		   PreparedStatement stmt = null;
		   ResultSet rs = null;
		   
		   try {
			String query = "select * from dept"; //(가지고 오고자하는 쿼리문을 넣어준다)
			//내 어플리케이션 오라클하고 접속(connection)
			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);
			//stmt.excuteQuery() = 채팅처럼 sql 구문을 엔터쳐서 전달
			//결과를 ResultSet으로 받아옴
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				DeptDto dto = new DeptDto(deptno,dname,loc);
				dtos.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
		   return dtos;
	   }
}