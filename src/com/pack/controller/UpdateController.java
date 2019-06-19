package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.model.Customer;
import com.pack.service.CustomerServiceImpl;


/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		String addr=request.getParameter("address");
		float sal=Float.parseFloat(request.getParameter("sal"));
		String city=request.getParameter("city");
		Customer c=new Customer(id,addr,city,sal);
		int i=0;
		try
		{
			i=new CustomerServiceImpl().updateCustomer(c);
			
		}
		catch(Exception e)
		{
			
		}
		if(i!=0)
		{
			List<Customer> clist= new CustomerServiceImpl().fetchCustomers();
			request.setAttribute("custList", clist);
			RequestDispatcher rd=request.getRequestDispatcher("/jspfiles/index.jsp");
			rd.forward(request,response);
			
		}
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
