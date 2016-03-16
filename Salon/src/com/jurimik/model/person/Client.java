package com.jurimik.model.person;

import com.jurimik.builder.PersonBuilder;

public class Client extends Person {

	private String cartNumber;
	
	public Client(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public Client(PersonBuilder builder) {
		super(builder);
		this.cartNumber = builder.getCard();
	}

	public String getCartNumber() {
		return cartNumber;
	}

	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}

	@Override
	public String toString() {
		return "Client " + getFirstName() + " " + getLastName() + ". Phone: " + getPhone() + 
				(cartNumber != null ? ", card number: " + cartNumber : "");
	}
	
}
