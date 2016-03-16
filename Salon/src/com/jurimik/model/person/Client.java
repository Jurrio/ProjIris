package com.jurimik.model.person;

public class Client extends Person {

	private String cartNumber;
	
	public Client(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public String getCartNumber() {
		return cartNumber;
	}

	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}
	
}
