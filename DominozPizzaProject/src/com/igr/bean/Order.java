package com.igr.bean;

public class Order {
	private int dishId;
	private int locationId;
	private double totalCost;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int dishId, int locationId, double totalCost) {
		super();
		this.dishId = dishId;
		this.locationId = locationId;
		this.totalCost = totalCost;
	}
	@Override
	public String toString() {
		return "Order [dishId=" + dishId + ", locationId=" + locationId + ", totalCost=" + totalCost + "]";
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	

}
