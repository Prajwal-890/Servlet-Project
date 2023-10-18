package servlet_basic.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_basic.dao.EmployeeDao;

@WebServlet("/ghi")
public class Fetch extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("fetchid");
		System.out.println(id);
		EmployeeDao dao = new EmployeeDao();
		int cid = Integer.parseInt(id);
		
		
		Object info = dao.fetch(cid);
		res.getWriter().println(info);
		
	}

}
//it is used in the case of genericServlet
