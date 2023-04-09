package com.pizza.main;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.pizza.bean.Order;
import com.pizza.bean.PizzaType;
import com.pizza.bean.Price;
import com.pizza.bean.Topping;
import com.pizza.util.DominozPizza;
import com.pizza.util.DominozPizzaImpl;

public class DominozClient {
	public static void main(String[] args) {
		DominozPizza dp = new DominozPizzaImpl();
		
		Map<PizzaType, Map<Topping,Price>> map = dp.populateData("topping.txt", "price.txt");
		//System.out.println(map);
		for(Entry<PizzaType, Map<Topping,Price>> m :map.entrySet()) {			
		System.out.println(m);
			}
		System.out.println("-------------------------------------------------------------------------------------------");
		List<Order> ordList = dp.calculateOrder("order.txt", map);
//		System.out.println(ordList);
		for (Order order : ordList) {
			System.out.println(order);
		}
		System.out.println("-------------------------------------------------------------------------------------------");
		Order highestOrder = dp.chooseHighestCostOrder(ordList);
		System.out.println(highestOrder);

		System.out.println("-------------------------------------------------------------------------------------------");
		Order order1 = new Order(2, 1281, "medium", "Chicken Bbq Pizza", 0);
		boolean ords = dp.checkOrder(order1, map);
		System.out.println(ords);

		System.out.println("--------------------------------------------------------------------------------------------");

		Order id = ordList.get(2);
		double o = dp.calculateBill(id);
		System.out.println(o);
		
		System.out.println("--------------------------------------------------------------------------------------------");

	}
}


