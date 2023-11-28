package basics;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/normal")
public class normal extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String item=req.getParameter("item");
//	resp.getWriter().print("<h1> working </h1>");
	double mobile_price=28000;
	double shirt_price=1200;
	double laptop_price=50000;
	double discount=10;
	double CP=0;
	double SP=0;
	double D=0;
	
	if(item.equalsIgnoreCase("Mobile")) {
		CP = mobile_price;
		} else if(item.equalsIgnoreCase("Shirt")) {
		CP = shirt_price;
	}else {
		CP = laptop_price;
	}
	discount=(CP*discount)/100;
	SP=CP-discount;
	resp.getWriter().print("<h1> You have selected :"+item+"</h1>");
	resp.getWriter().print("<h1> Cost price is :"+CP+"</h1>");
	resp.getWriter().print("<h1> Discount price is :"+discount+"</h1>");
	resp.getWriter().print("<h1> Selling price is :"+SP+"</h1>");
	
	
}
}

