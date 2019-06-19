package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.model.Customer;
import com.pack.service.CustomerServiceImpl;

/**
 * Servlet implementation class CustomerController
 */

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
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
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("name");
		String salary=request.getParameter("salary");
		float sal=Float.parseFloat(salary);
		String addr=request.getParameter("address");
		String city=request.getParameter("city");
		Random r=new Random();
		int id=r.nextInt(900000)+100000;
		Customer c=new Customer(id,name,addr,city,sal);
		int i=new CustomerServiceImpl().insertCustomer(c);
		if(i==1)
		{
			List<Customer> customerList=new CustomerServiceImpl().fetchCustomers();
			request.setAttribute("custlist", customerList);
			RequestDispatcher rd=request.getRequestDispatcher("/jspfiles/index.jsp");
			rd.forward(request, response);
		}
		
	}

}
