package test;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.*;
@SuppressWarnings("serial")
@WebServlet("/second")

public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	  throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("======Product Details====<br>");
		pw.println("ProductCode: "+req.getParameter("code")+"<br>");
		pw.println("ProductName: "+req.getParameter("name")+"<br>");
		pw.println("ProductPrice: "+req.getParameter("price")+"<br>");
		pw.println("ProductQnty: "+req.getParameter("qnty")+"<br>");
	}

}
