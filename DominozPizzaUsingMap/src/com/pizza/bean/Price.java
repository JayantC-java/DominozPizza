package com.pizza.bean;

public class Price {
	private int toppingId;
	private double cost;
	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Price(int toppingId, double cost) {
		super();
		this.toppingId = toppingId;
		this.cost = cost;
	}
	public int getToppingId() {
		return toppingId;
	}
	public void setToppingId(int toppingId) {
		this.toppingId = toppingId;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Price [toppingId=" + toppingId + ", cost=" + cost + "]";
	}
	
	

}
