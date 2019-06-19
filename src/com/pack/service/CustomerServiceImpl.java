package com.pack.service;

import java.util.List;

import com.pack.dao.CustomerDaoImpl;
import com.pack.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public int insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		int i=new CustomerDaoImpl().insertCustomer(c);
		return i;
	}


	@Override
	public List<Customer> fetchCustomers() {
		// TODO Auto-generated method stub
		List<Customer> l=new CustomerDaoImpl().fetchCustomers();
		return l;
	}


	@Override
	public Customer fetchCustomer(int cid) throws Exception {
		// TODO Auto-generated method stub
		Customer c=new CustomerDaoImpl().fetchCustomer(cid);
		return c;
	}


	@Override
	public int updateCustomer(Customer c) throws Exception {
		// TODO Auto-generated method stub
		int i=new CustomerDaoImpl().updateCustomer(c);
		return i;
	}


	@Override
	public int deleteCustomer(int id)  throws Exception{
		// TODO Auto-generated method stub
		int i= new CustomerDaoImpl().deleteCustomer(id);
		return i;
	}
	
}
