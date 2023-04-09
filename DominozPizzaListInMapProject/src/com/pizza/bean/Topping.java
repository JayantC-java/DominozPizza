package com.pizza.bean;

public class Topping {
	private int keyId;
	private int toppingId;
	private String toppingName;
	private double timeToCook;
	public Topping() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topping(int keyId, int toppingId, String toppingName, double timeToCook) {
		super();
		this.keyId = keyId;
		this.toppingId = toppingId;
		this.toppingName = toppingName;
		this.timeToCook = timeToCook;
	}
	@Override
	public String toString() {
		return "Topping [keyId=" + keyId + ", toppingId=" + toppingId + ", toppingName=" + toppingName + ", timeToCook="
				+ timeToCook + "]";
	}
	public int getKeyId() {
		return keyId;
	}
	public void setKeyId(int keyId) {
		this.keyId = keyId;
	}
	public int getToppingId() {
		return toppingId;
	}
	public void setToppingId(int toppingId) {
		this.toppingId = toppingId;
	}
	public String getToppingName() {
		return toppingName;
	}
	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}
	public double getTimeToCook() {
		return timeToCook;
	}
	public void setTimeToCook(double timeToCook) {
		this.timeToCook = timeToCook;
	}
	
	

}
