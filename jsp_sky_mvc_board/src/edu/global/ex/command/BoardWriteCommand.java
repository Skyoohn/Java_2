package edu.global.ex.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BoardDao;
import edu.global.ex.dto.BoardDto;

public class BoardWriteCommand implements BoardCommand{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	System.out.println("BoardWriteCommand entry.."); //디버깅을 위한 코드
	
	String bname = request.getParameter("bname");
	String btitle = request.getParameter("btitle");
	String bcontent = request.getParameter("bcontent");
	
	BoardDao boardDao = new BoardDao();
	
	boardDao.write(bname,btitle,bcontent);
	}
}