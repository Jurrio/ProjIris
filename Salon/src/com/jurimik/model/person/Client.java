package com.jurimik.model.person;

public class Client extends Person {

	private String cartNumber;
	
	public Client(String firstName, String lastName, String phone, String cardNumber) {
		super(firstName, lastName, phone);
		this.cartNumber = cardNumber;
	}

	public String getCartNumber() {
		return cartNumber;
	}

	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}
	
}
