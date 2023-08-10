package edu.global.ex.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.dao.BoardDao;
import edu.global.ex.dto.BoardDto;

public class BoardContentCommand implements BoardCommand{
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	System.out.println("BContentCommand entry.."); //디버깅을 위한 코드
	
	String bid = request.getParameter("bid");
	
	
	BoardDao boardDao = new BoardDao();
	
	BoardDto dtos = boardDao.contentView(bid);
	//request에 담긴 데이터를 Bcontroller에서 forwarding으로 넘김으로서
	//dto객체를 content_view.jsp에서 사용할 수 있도록 한다.
	request.setAttribute("content_view", dtos);
	}
}