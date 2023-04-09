package com.pizza.bean;

public class Order implements Comparable<Order> {
	private int keyId;
	private int toppingId;
	private String toppingName;
	private String size;
	private double cost =0;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int keyId, int toppingId, String toppingName, String size, double cost) {
		super();
		this.keyId = keyId;
		this.toppingId = toppingId;
		this.toppingName = toppingName;
		this.size = size;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Order [keyId=" + keyId + ", toppingId=" + toppingId + ", toppingName=" + toppingName + ", size=" + size
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
	public String getToppingName() {
		return toppingName;
	}
	public void setToppingName(String toppingName) {
		this.toppingName = toppingName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		if (this.cost < o.cost)
			return 1;
		else if(this.cost > o.cost)
			return -1;
		else
			return 0;
	}
	
	

}
