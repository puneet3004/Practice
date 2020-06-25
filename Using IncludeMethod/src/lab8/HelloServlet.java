package lab8;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{


	RequestDispatcher rd1=req.getRequestDispatcher("header.html");
	rd1.include(req, res);
	
	RequestDispatcher rd2=req.getRequestDispatcher("home.html");
	rd2.include(req, res);

	RequestDispatcher rd3=req.getRequestDispatcher("footer.html");
	rd3.include(req, res);
	
	 
//		RequestDispatcher rd=req.getRequestDispatcher("home.jsp");
//		rd.forward(req, res);
	}
}