package com.pack.dao;

import java.util.List;

import com.pack.model.Customer;

public interface CustomerDao {
	public int insertCustomer(Customer c);
	public List<Customer> fetchCustomers();
	public Customer fetchCustomer(int cid) throws Exception;
	public int updateCustomer(Customer c)throws Exception;
	public int deleteCustomer(int id )throws Exception;

}
