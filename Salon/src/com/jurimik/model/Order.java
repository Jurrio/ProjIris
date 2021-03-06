package com.jurimik.model;

import java.util.Date;
import java.util.List;

import com.jurimik.model.person.Person;

public class Order {
	private Date date;
	private Person client;
	private Person employee;
	private double price;
	private List<Product> products;
	
	public Order() {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Person getClient() {
		return client;
	}

	public void setClient(Person client) {
		this.client = client;
	}

	public Person getEmployee() {
		return employee;
	}

	public void setEmployee(Person employee) {
		this.employee = employee;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
