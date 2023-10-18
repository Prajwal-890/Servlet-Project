package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.EmployeeDao;
import servlet_basic.dto.EmployeeDto;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empid = req.getParameter("id");
		int cid = Integer.parseInt(empid);
		String emppassword = req.getParameter("pwd");
		EmployeeDao dao = new EmployeeDao();
		EmployeeDto e1 = dao.findid(cid);
		if (e1 != null) {
			if (emppassword.equals(e1.getPwd())) {
				resp.getWriter().print("<h1>Welcome to Home Page</h1>");
			}else {
				resp.getWriter().print("<h1>Please enter the proper password</h1>");
			}
		}else {
			resp.getWriter().print("<h1>Please enter the proper id</h1>");
			resp.getWriter().print("<a href='form.html'>If no account click,click here to register</a>");
		}

	}
}
