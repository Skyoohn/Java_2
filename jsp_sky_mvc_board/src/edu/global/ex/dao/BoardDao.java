package edu.global.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import edu.global.ex.dto.BoardDto;

public class BoardDao {
	private DataSource datasource = null;

	public BoardDao() {
		try {
			Context context = new InitialContext();
			datasource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public List<BoardDto> list() {
		ArrayList<BoardDto> dtos = new ArrayList<BoardDto>();

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			String query = "select * from mvc_board order by bgroup desc,bstep asc"; // (가지고 오고자하는 쿼리문을 넣어준다)
			// 내 어플리케이션 오라클하고 접속(connection)
			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);
			// stmt.excuteQuery() = 채팅처럼 sql 구문을 엔터쳐서 전달
			// 결과를 ResultSet으로 받아옴
			rs = stmt.executeQuery();

			while (rs.next()) {
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");

				BoardDto dto = new BoardDto(bid, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

				dtos.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}

	// 리턴타입이 BDto인 이유:
	//

	public BoardDto contentView(String bid) {

		BoardDto dto = null;

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 쿼리문 작성시 찾으려는 글번호에 로 넘기고 아래서 preparedStatement로 set 해준다.

			String query = "select * from mvc_board where bid = ?"; // (가지고 오고자하는 쿼리문을 넣어준다)
			// 내 어플리케이션 오라클하고 접속(connection)
			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);
			// stmt.excuteQuery() = 채팅처럼 sql 구문을 엔터쳐서 전달
			// 결과를 ResultSet으로 받아옴

			stmt.setInt(1, Integer.valueOf(bid));

			rs = stmt.executeQuery();

			// 한 행의 데이터만 가져오기 때문에 while 말고 if(rs.next())로 해도 가능하다.
			while (rs.next()) {
				int id = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");

				dto = new BoardDto(id, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	public void write(String bname, String btitle, String bcontent) {

		System.out.println("write()...");
		Connection con = null;
		PreparedStatement stmt = null;

		// 이때 ?,?,? 물음표는 아래에서 setString메소드로

		try {
			String query = "insert into mvc_board " + "(bid, bname, btitle, bcontent, bhit, bgroup, bstep, bindent)"
					+ "values (mvc_board_seq.nextval,?,?,?,0, mvc_board_seq.currval,0,0)";
			// 내 어플리케이션 오라클하고 접속(connection)
			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);
			stmt.setString(1, bname);
			stmt.setString(2, btitle);
			stmt.setString(3, bcontent);

			int rn = stmt.executeUpdate();

			System.out.println("write 한 갯수" + rn);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public void modify(String bid, String bname, String btitle, String bcontent) {

		System.out.println("modify()...");
		Connection con = null;
		PreparedStatement stmt = null;

		try {
			String query = "update mvc_board " + "set bname = ?, btitle = ?, bcontent = ? where bid = ?";

			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);

			stmt.setString(1, bname);
			stmt.setString(2, btitle);
			stmt.setString(3, bcontent);
			stmt.setInt(4, Integer.valueOf(bid));

			int rn = stmt.executeUpdate();

			System.out.println("write 한 갯수" + rn);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void delete(String bid) {

		System.out.println("delete()...");
		Connection con = null;
		PreparedStatement stmt = null;

		try {
			String query = "delete from mvc_board " + "where bid = ?";

			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);

			stmt.setInt(1, Integer.valueOf(bid));

			int rn = stmt.executeUpdate();

			System.out.println("delete 한 갯수" + rn);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public BoardDto reply_view(String bid) {

		BoardDto dto = null;

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			// 쿼리문 작성시 찾으려는 글번호에 로 넘기고 아래서 preparedStatement로 set 해준다.

			String query = "select * from mvc_board where bid = ?"; // (가지고 오고자하는 쿼리문을 넣어준다)
			// 내 어플리케이션 오라클하고 접속(connection)
			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);
			// stmt.excuteQuery() = 채팅처럼 sql 구문을 엔터쳐서 전달
			// 결과를 ResultSet으로 받아옴

			stmt.setInt(1, Integer.valueOf(bid));

			rs = stmt.executeQuery();

			// 한 행의 데이터만 가져오기 때문에 while 말고 if(rs.next())로 해도 가능하다.
			while (rs.next()) {
				int id = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				int bgroup = rs.getInt("bgroup");
				int bstep = rs.getInt("bstep");
				int bindent = rs.getInt("bindent");

				dto = new BoardDto(id, bname, btitle, bcontent, bdate, bhit, bgroup, bstep, bindent);

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	public void reply(String bid, String bname, String btitle, String bcontent, String bgroup, String bstep,
			String bindent) {

		System.out.println("reply()...");

		// -> 답글위치 잡기 - 세로정리 = step 정리
		replyShape(bgroup, bstep);

		Connection con = null;
		PreparedStatement stmt = null;

		// 이때 ?,?,? 물음표는 아래에서 setString메소드로 넣어줄 값을 표현하는 것
		// 파라미터로 받는 값이 bname,btitle,bcontent 3개이므로 3개만 ?로 넣고 나머지는 0으로 설정했다.
		// 글작성 조회수(bhit)는 0이고, 원본글로 취급하므로 bstep,bindent는 지수를 넣어줄 필요가 없기 때문이다.

		try {
			String query = "insert into mvc_board(bid,bname,btitle,bcontent, " +
                    " bgroup,bstep,bindent) values (mvc_board_seq.nextval, ?, ?, ?, ?, ?, ?)";
			
			
			// 내 어플리케이션 오라클하고 접속(connection)
			con = datasource.getConnection();
			// stmt = 빨대 = 커낵션객체에서 빨대 가져옴
			stmt = con.prepareStatement(query);
			
			stmt.setString(1, bname);
			stmt.setString(2, btitle);
			stmt.setString(3, bcontent);
			stmt.setInt(4, Integer.parseInt(bgroup));
			stmt.setInt(5, Integer.parseInt(bstep)+1);
			stmt.setInt(6, Integer.parseInt(bindent)+1);

			int rn = stmt.executeUpdate();

			System.out.println("write 한 갯수" + rn);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	private void replyShape(String group, String step) {

		System.out.println("replyShape()..."); // -> 디버깅문구

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			String query = "update mvc_board set bstep = bstep + 1 " + "where bgroup = ? and bstep > ?";
			/*
			 * ※bstep을 1씩 증가 시킨다는 건 -> 답글달려는 원본글 기준 답글 달린 글들이 1칸씩 아래로 내려간다는 뜻.
			 */

			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, Integer.parseInt(group));
			preparedStatement.setInt(2, Integer.parseInt(step));

			int rn = preparedStatement.executeUpdate();
			System.out.println("업데이트 갯수 : " + rn);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}