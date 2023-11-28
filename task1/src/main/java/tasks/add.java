package tasks;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addition")

public class add extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int number1=Integer.parseInt(req.getParameter("number1"));
	int number2=Integer.parseInt(req.getParameter("number2"));
	int res=number1+number2;
	resp.getWriter().print("<h1> The Addition of "+ number1+" and"+number2+" is "+res+"</h1>");
//	System.out.println("The addition of "+ number1 +" "+number2+" "+" is"+ res);
}
}
