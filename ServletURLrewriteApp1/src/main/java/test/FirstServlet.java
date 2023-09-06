package test;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
@SuppressWarnings("serial")
@WebServlet("/first")

public class FirstServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	  throws ServletException,IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		ProductBean pb1=new ProductBean();
		pb1.setPCode(req.getParameter("pcode"));
		ProductBean pb2=new RetrieveDAO().retrieve(pb1);
		if(pb2==null) {
			pw.println("Invalid Product Code...<br>");
			RequestDispatcher rd=req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
		else {
			pw.println("<a href='second?code="+pb2.getPCode()
			+"&name="+pb2.getPName()
			+"&price="+pb2.getPPrice()
			+"&qnty="+pb2.getPQnty()+"'>ViewDetails</a>");
		}
	}

}
