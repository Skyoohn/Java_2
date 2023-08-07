package edu.global.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.global.ex.shape.Circle;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/rectangle")
public class RectangleServelet2 extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public RectangleServelet2() {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
      
      double width = Double.valueOf(request.getParameter("width"));
      double height =  Double.valueOf(request.getParameter("height"));   
      
      double area = width * height;
      
      System.out.println("넓이:" + area);
      
      response.setContentType("text/html; charset=UTF-8");

      PrintWriter writer = response.getWriter();

      writer.println("<html>");
      writer.println("<head>");
      writer.println("</head>");
      writer.println("<body>");
      writer.println("<h1> 넓이는:" + area + "</h1>");
      writer.println("</body>");
      writer.println("</html>");

      writer.close();

   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      

   }

}