package com.pack.model;

public class Customer {

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	private Integer id;
	private String name,address,city;
	private Float salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Customer(Integer id, String name, String address, String city, Float salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.salary = salary;
	}
	public Customer(Integer id, String address, String city, Float salary) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.salary = salary;
	}
	

}
