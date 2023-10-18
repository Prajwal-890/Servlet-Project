package servlet_basic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import servlet_basic.dao.EmployeeDao;
import servlet_basic.dto.EmployeeDto;

@WebServlet("/deletebyid")
public class Delete extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		String id = req.getParameter("id");
//		int cid = Integer.parseInt(id);
//		System.out.println(cid);
//
//		EmployeeDao emplyeedao = new EmployeeDao();
//		String msg = emplyeedao.delete(cid);
//		res.getWriter().println(msg);
		
		
//		------------------------------------------------------------------------------------
//		Dynamically deleting the data
		String id = req.getParameter("id");
		int cid = Integer.parseInt(id);
		EmployeeDao emplyeedao = new EmployeeDao();
		emplyeedao.delete(cid);
		
		List<EmployeeDto> list = emplyeedao.fetchAll();
		req.setAttribute("objects", list);
		
		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.forward(req, res);
		
		
	}

}
