package tasks;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/division")
public class Divide extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double number1=Double.parseDouble(req.getParameter("number1"));
		double number2=Double.parseDouble(req.getParameter("number2"));
		double res=number1/number2;
		resp.getWriter().print("<h1> The division of "+ number1+" and"+number2+" is "+res+"</h1>");
}
}
