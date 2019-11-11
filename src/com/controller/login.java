package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.*;
import com.dao.Regdao;

import Regvo.Registervo;
import Regvo.hod_loginvo;
import Regvo.stud_loginvo;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String un=request.getParameter("username");
		String ps=request.getParameter("pass");
		
		String hod_un=request.getParameter("hod_un");
		String hod_ps=request.getParameter("hod_ps");
		
		String princ_un=request.getParameter("princ_un");
		String princ_ps=request.getParameter("princ_ps");
		
		String dept_un=request.getParameter("dept_un");
		String dept_ps=request.getParameter("dept_ps");
		
		String ss_un=request.getParameter("ss_un");
		String ss_ps=request.getParameter("ss_ps");
		
//		stud_loginvo v=new stud_loginvo();
		Registervo rv= new Registervo();
		Regdao d=new Regdao();
		
		rv.setUn(un);
		rv.setPs(ps);
		
		/*hod_loginvo v1= new hod_loginvo();
		v1.setHod_un(hod_un);
		v1.setHod_pswd(hod_ps);
		*/
		
		
		List<Registervo> ls=d.search(rv);
		
		String u=rv.getUn();
		String p=rv.getPs();
		if(un.equals("u") && ps.equals("p"))
		{
			response.sendRedirect("Welcome1.jsp");
		}
		else
		{
			
			response.sendRedirect("signup.html");
		}
		
		
		
		
	}

}
