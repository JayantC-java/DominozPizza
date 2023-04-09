package com.pizza.util;

import java.util.List;
import java.util.Map;

import com.pizza.bean.Order;
import com.pizza.bean.PizzaType;
import com.pizza.bean.Price;
import com.pizza.bean.Topping;

public interface DominozPizza {
	Map<PizzaType, Map<Topping, Price>> populateData(String toppingFile, String priceFile);
	
	List<Order> calculateOrder(String orderFile, Map<PizzaType, Map<Topping, Price>> map);
	
	Order chooseHighestCostOrder(List<Order> order);
	
	boolean checkOrder(Order order, Map<PizzaType, Map<Topping, Price>> map);
	
	double calculateBill(Order order);


}
