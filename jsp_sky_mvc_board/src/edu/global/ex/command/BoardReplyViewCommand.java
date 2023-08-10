package edu.global.ex.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BoardDao;
import edu.global.ex.dto.BoardDto;

public class BoardReplyViewCommand implements BoardCommand{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	System.out.println("BoardReplyViewCommand entry.."); //디버깅을 위한 코드
	
	String bid = request.getParameter("bid");
	
	BoardDao boardDao = new BoardDao();
	
	BoardDto dto = boardDao.reply_view(bid);
	
	request.setAttribute("reply_view", dto);
	}
}