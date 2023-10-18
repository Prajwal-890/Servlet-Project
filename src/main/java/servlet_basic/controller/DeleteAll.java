package servlet_basic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_basic.dao.EmployeeDao;


@WebServlet("/deleteall")
public class DeleteAll extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.doDelete(req, resp);
		EmployeeDao dao = new EmployeeDao();
		String list = dao.deleteAll();
		resp.getWriter().print(list);
		
		
		
	}
}
