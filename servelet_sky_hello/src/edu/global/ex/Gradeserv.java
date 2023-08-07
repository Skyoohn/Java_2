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
@WebServlet("/Gradese")
public class Gradeserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gradeserv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		double kor = Double.valueOf(request.getParameter("kor"));
		double eng = Double.valueOf(request.getParameter("eng"));
		double math = Double.valueOf(request.getParameter("math"));
		
		Double avg = (kor + eng + math) / 3.0;
		
		System.out.println("평균:" + avg);
		
		response.setContentType("text/html; charset=UTF-8");

	    PrintWriter writer = response.getWriter();

	      writer.println("<html>");
	      writer.println("<head>");
	      writer.println("</head>");
	      writer.println("<body>");
	      writer.println("<h1> 점수는:" + avg + "</h1>");
	      writer.println("</body>");
	      writer.println("</html>");

	      writer.close();
	   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
