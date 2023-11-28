package Controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Userdto;
import service.Userservice;
@WebServlet("/signup")
public class signup extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("pwd");
	long mobile=Long.parseLong(req.getParameter("mob"));
	String gender=req.getParameter("gender");
	LocalDate dob= LocalDate.parse(req.getParameter("dob"));
	
	int age=LocalDate.now().getYear()-dob.getYear();
	
//	resp.getWriter().print("<h1>");
//	resp.getWriter().print("Name: "+ name+"<br>");
//	resp.getWriter().print("Email: "+email+"<br>");
//	resp.getWriter().print("Password: "+ password+"<br>");
//	resp.getWriter().print("Mobile: "+ mobile+"<br>");
//	resp.getWriter().print("Gender: "+ gender+"<br>");
//	resp.getWriter().print("DOB: "+ dob+"<br>"); 
//int age1=Period.between(dob, LocalDate().now()).getYears();
//	resp.getWriter().print("<h1>");
//	
	Userdto dto=new Userdto();
	dto.setPassword(password);
	dto.setName(name);
	dto.setAge(age);
	dto.setDob(dob);
	dto.setEmail(email);
	dto.setGender(gender);
	dto.setMobile(mobile);
	
	Userservice service=new Userservice();
	if(service.saveUser(dto))
	{
	  resp.getWriter().print("<h1 style='color:green'>Account created Successfully</h1>");	
	  req.getRequestDispatcher("login.html").include(req, resp);
	}
	else
	{
		resp.getWriter().print("<h1 style='color:green'>Sorry!!!Account can not be created Successfully</h1>");	
	
		req.getRequestDispatcher("signup.html").include(req, resp);
	
	}
}
}

