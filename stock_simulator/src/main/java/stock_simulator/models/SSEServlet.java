package stock_simulator.models;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SSEServlet
 */
@WebServlet("/SSEServlet")
public class SSEServlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SSEServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
  response.setContentType("text/event-stream");
  response.setCharacterEncoding("UTF-8");
  PrintWriter printWriter = null;
  while (true) {
   try {
    double randomNumber = Math.random()*100;
    printWriter = response.getWriter();
    printWriter.print(Calendar.getInstance().getTimeInMillis());
    response.flushBuffer();
    Thread.sleep((long)randomNumber);
   } catch (Exception e) {
    printWriter.close();
    break;
   }
   
   
   
  }
  response.getWriter().append("Served at: ").append(request.getContextPath());
 }

 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }

}