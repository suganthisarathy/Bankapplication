package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pack.JdbcConnection;
import com.pack.model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public CustomerDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	
	public int insertCustomer(Customer c) {
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try {
			
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			ps.setInt(1, c.getId());
			ps.setString(2,c.getName());
			ps.setString(3, c.getAddress());
			ps.setFloat(4, c.getSalary());
			ps.setString(5,c.getCity());
			 i=ps.executeUpdate();
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			try {
				if(con!=null)
					con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return i;
	}


	@Override
	public List<Customer> fetchCustomers() {
		// TODO Auto-generated method stub
	Connection con=null;
	List<Customer> l=new ArrayList<>();
	    try
	   {
		con=JdbcConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select custid,cname,address,salary,city from customer");
		
		while(rs.next()){
			Customer c=new Customer();
			c.setId(rs.getInt(1));
			c.setName(rs.getString(2));
			c.setAddress(rs.getString(3));
			c.setSalary(rs.getFloat(4));
			c.setCity(rs.getString(5));
			l.add(c);
		}
	   }
	   catch(Exception e)
	  {
		System.out.println(e);
	   }
		finally
		{
			try
			{
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return l;
	}


	@Override
	public Customer fetchCustomer(int cid) throws Exception{
		// TODO Auto-generated method stub
		Connection con=JdbcConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("select custid,cname,address,salary,city from customer where custid=?");
		ps.setInt(1, cid);
		ResultSet rs=ps.executeQuery();
		Customer c=null;
		while(rs.next())
		{
			c=new Customer();
			c.setId(rs.getInt(1));
			c.setName(rs.getString(2));
			c.setAddress(rs.getString(3));
			c.setSalary(rs.getFloat(4));
			c.setCity(rs.getString(5));
			
		}
		con.close();
		ps.close();
		
		return c;
	}


	@Override
	public int updateCustomer(Customer c) throws Exception {
		// TODO Auto-generated method stub
		Connection con=JdbcConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("update customer set address=?,salary=?,city=? where custid=?");
		ps.setString(1, c.getAddress());
		ps.setFloat(2, c.getSalary());
		ps.setString(3, c.getCity());
		ps.setInt(4, c.getId());
		int i=ps.executeUpdate();
		con.close();
		ps.close();
		return i;
	}


	@Override
	public int deleteCustomer(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection con=JdbcConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from customer where custid=?");
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		con.close();
		ps.close();
		return i;
	}


	
	
	


	

}
