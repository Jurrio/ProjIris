package com.jurimik.model;

public class Product {
	
	private int id;
    private String code;
    private String name;
    private int price;
    private int amount;

    public Product(String code, String name, int price, int amount) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
