package com.pizza.bean;

public class Order {
	private int keyId;
	private int toppingId;
	private String size;
	private String toppingName;
	private double cost = 0;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int keyId, int toppingId, String size, String toppingName, double cost) {
		super();
		this.keyId = keyId;
		this.toppingId = toppingId;
		this.size = size;
		this.toppingName = toppingName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [keyId=" + keyId + ", toppingId=" + toppingId + ", size=" + size + ", toppingName=" + toppingName
				+ ", cost=" + cost + "]";
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getToppingName() {
		return toppingName;
	}
	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
