package firstassignment.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import firstassignment.beans.RegInfoBean;
import firstassignment.dao.RegisterDao;

@WebServlet("/register")
public class Register extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//req.getSession();
	List<RegInfoBean> list = RegisterDao.register(req);
		HttpSession sess = req.getSession();
		sess.setAttribute("listitem", list);
	//System.out.println(list);
		req.getRequestDispatcher("/Success.jsp").forward(req, resp);
	
		
//		System.out.println(list);
		
		
		
		
		

		
	}

}
