package com.igr.bean;

public class Dish {
	private int dishId;
	private String dishName;
	private double cost;
	private int timeToCook;
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(int dishId, String dishName, double cost, int timeToCook) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.cost = cost;
		this.timeToCook = timeToCook;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getTimeToCook() {
		return timeToCook;
	}
	public void setTimeToCook(int timeToCook) {
		this.timeToCook = timeToCook;
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", cost=" + cost + ", timeToCook=" + timeToCook
				+ "]";
	}
	

}
