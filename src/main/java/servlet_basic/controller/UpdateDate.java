package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.EmployeeDao;
import servlet_basic.dto.EmployeeDto;

@WebServlet("/update")
public class UpdateDate extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		String date = req.getParameter("dob");
		
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setName(name);
		employeeDto.setEmail(email);
		employeeDto.setEmail(email);
		employeeDto.setPwd(pwd);
		employeeDto.setDob(date);
		
		EmployeeDao dao = new EmployeeDao();
		dao.update(employeeDto);
		
		System.out.println(id+name+email+pwd+date);
		resp.getWriter().print("data updated successfully");
		
		
	}
}
