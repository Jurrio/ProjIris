package com.jurimik.dao;

import java.util.ArrayList;
import java.util.List;

import com.jurimik.model.Product;

public class ProductRepository {
	private static List<Product> productList = new ArrayList<>();
	private static int id = 0;
	
	public static boolean add(Product product) {
		product.setId(nextId());
		productList.add(product);
		return (productList.contains(product));
	}

	public static boolean delete(int id) {
		for (Product product : productList) {
			if (product.getId() == id) {
				productList.remove(product);
				return true;
			}
		}
		return false;
	}
	
	public static List<Product> find(String searchValue) {
		List<Product> resultList = new ArrayList<>();
		for (Product product : productList) {
			String[] values = product.toString().split(" ");
			for (String s : values) {
				if (s.equals(searchValue)) {
					resultList.add(product);
					break;
				}
			}
		}
		return resultList;
	}
	
	private static int nextId() {
		return ++id;
	}
}
