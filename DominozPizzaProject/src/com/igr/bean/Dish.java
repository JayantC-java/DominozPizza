package com.igr.bean;

import java.util.Set;

public class Dish {
	private int dishId;
	private String dishName;
	private int dishCost;
	private double timeToCook;
	private Set<Location> set;
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(int dishId, String dishName, int dishCost, double timeToCook) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.dishCost = dishCost;
		this.timeToCook = timeToCook;
	}
	public Set<Location> getSet() {
		return set;
	}
	public void setSet(Set<Location> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", dishCost=" + dishCost + ", timeToCook="
				+ timeToCook + "]";
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
	public int getDishCost() {
		return dishCost;
	}
	public void setDishCost(int dishCost) {
		this.dishCost = dishCost;
	}
	public double getTimeToCook() {
		return timeToCook;
	}
	public void setTimeToCook(double timeToCook) {
		this.timeToCook = timeToCook;
	}
	

}
