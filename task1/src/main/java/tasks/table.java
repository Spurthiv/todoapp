package tasks;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/table")
public class table extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int number=Integer.parseInt(req.getParameter("number"));
	for(int i=0;i<=10;i++) {
		int res=number*i;
		resp.getWriter().print("<h1>"+ number+" * "+i+" = "+res+"</h1>");
}
}
}
