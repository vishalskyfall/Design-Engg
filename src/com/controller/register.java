package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.Regdao;

import Regvo.Registervo;
import Regvo.hod_loginvo;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
		Regdao d=new Regdao();
		int flag=Integer.parseInt(request.getParameter("flag"));
		if(flag ==1)
		{	
		String un=request.getParameter("username");
		String ps=request.getParameter("password");
		String em=request.getParameter("email");
		Registervo v=new Registervo();
		v.setUn(un);
		v.setEm(em);
		v.setPs(ps);
		
		
		d.insert(v);
		}
	
		String hod_un=request.getParameter("hod_us");
		String hod_pswd=request.getParameter("hos_pass");
		
		String princ_un=request.getParameter("princ_us");
		String princ_pswd=request.getParameter("princ_pass");
		
		String dept_un=request.getParameter("dept_us");
		String dept_pswd=request.getParameter("dept_pass");
		
		String ss_un=request.getParameter("ss_us");
		String ss_pswd=request.getParameter("ss_pass");
		
		
		
		
		hod_loginvo h=new hod_loginvo();
		h.setHod_un(hod_un);
		h.setHod_pswd(hod_pswd);
		d.insert(h);
		
		
		//List ls1=d.search(v);
		
		/*HttpSession session=request.getSession();
		session.setAttribute("ls", ls1);*/
		response.sendRedirect("Welcome1.jsp");
		
	}

}
