package tasks;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validating")
public class validating extends HttpServlet{

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String pwd=req.getParameter("pwd");
	if(email.length()==5) {
		for(int i=0;i<pwd.length()-1;i++) {
			if(pwd.charAt(i)>=65 && pwd.charAt(i)<=90 && pwd.charAt(i)>=97 && pwd.charAt(i)<=122 ) {
				resp.getWriter().print("<h1> good </h1>");
				req.getRequestDispatcher("/pass.html").forward(req, resp);
			}
		}
	}else {		resp.getWriter().print("<h1> bad </h1>");
		req.getRequestDispatcher("/fail.html").include(req, resp);
	}
}
}
