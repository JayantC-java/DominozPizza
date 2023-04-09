package com.pizza.bean;

import java.util.HashMap;

public class Type {
	private Key key;

	public Type(Key k, HashMap<Topping, Price> hashMap) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Type(Key key) {
		super();
		this.key = key;
	}

	@Override
	public String toString() {
		return "Type [key=" + key + "]";
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
	
	
	

}
