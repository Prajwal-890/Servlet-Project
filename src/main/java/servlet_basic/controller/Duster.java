
package servlet_basic.controller;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_basic.dao.EmployeeDao;
import servlet_basic.dto.EmployeeDto;

@WebServlet("/abc")
public class Duster implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		System.out.println("welcome to thursday");
		String empid = req.getParameter("id");
		String empname = req.getParameter("name");
		String empemail = req.getParameter("email");
		String emppassword = req.getParameter("pwd");
		String empDOB = req.getParameter("dob");
		String empgender = req.getParameter("gender");
		String empcheckbox = req.getParameter("checkbox");
		String empcountry = req.getParameter("country");
//		System.out.println(empid);
//		System.out.println(empname);
//		System.out.println(empemail);
//		System.out.println(emppassword);
//		System.out.println(empDOB);
//		System.out.println(empmale);
//		System.out.println(empfemale);
//		System.out.println(empaccepetd);
//		res.getWriter().print(empid);
//		res.getWriter().print(empname);
		
		EmployeeDto employee = new EmployeeDto();
		int cid = Integer.parseInt(empid);
		employee.setId(cid);
		employee.setName(empname);
		employee.setEmail(empemail);
		employee.setPwd(emppassword);
		employee.setDob(empDOB);
		employee.setGender(empgender);
		employee.setCheckbox(empcheckbox);
		employee.setCountry(empcountry);
		System.out.println(employee);

		EmployeeDao empolyeeDao = new EmployeeDao();
		empolyeeDao.insert(employee);

	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
