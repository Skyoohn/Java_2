package edu.global.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import edu.global.dto.Dto;

public class Dao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "scott";
	private String pwd = "tiger";
	
	public Dao() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 검색 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public List<Dto> getEmps(){
		List<Dto> emps = new ArrayList<>();
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from emp";
		
		try {
			connection = DriverManager.getConnection(url,user,pwd);
			pstmt = connection.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Dto emp = new Dto();
				
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setSal(rs.getInt("sal"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return emps;
	}
}