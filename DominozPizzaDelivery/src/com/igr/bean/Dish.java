package com.igr.bean;

public class Dish {
	private int dishId;
	private String dishName;
	private int cost;
	private int timeTocook;
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dish(int dishId, String dishName, int cost, int timeTocook) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.cost = cost;
		this.timeTocook = timeTocook;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTimeTocook() {
		return timeTocook;
	}
	public void setTimeTocook(int timeTocook) {
		this.timeTocook = timeTocook;
	}
	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", dishName=" + dishName + ", cost=" + cost + ", timeTocook=" + timeTocook
				+ "]";
	}
	

}
