package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloworld
 */
@WebServlet("/post")
public class postme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postme() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      System.out.println("겟방식!!");
	      
	      response.setContentType("text/html; charset=euc-kr");
	         PrintWriter writer = response.getWriter();
	      
	      writer.println("<html>");
	         writer.println("<head>");
	         writer.println("</head>");
	         writer.println("<body>");
	         writer.println("<h1>겟방식입니다</h1>");
	         
	         writer.println("</body>");
	         writer.println("</html>");
	         
	         writer.close();
	   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	      System.out.println("포스트 방식");
	      
	      response.setContentType("text/html; charset=euc-kr");
	         PrintWriter writer = response.getWriter();
	      
	      writer.println("<html>");
	         writer.println("<head>");
	         writer.println("</head>");
	         writer.println("<body>");
	         writer.println("<h1>포스트방식 입니다</h1>");
	         
	         writer.println("</body>");
	         writer.println("</html>");
	         
	         writer.close();
	}

}
