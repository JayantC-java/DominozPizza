package com.igr.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;
import com.igr.bean.Order;
import com.igr.util.DominozPizzaImpl;

public class client {
	public static void main(String[] args) {
		List <Dish> l = new ArrayList<Dish>();
		Set <Location>s = new HashSet<Location>();
		List<Order> l3 = new ArrayList<Order>();
		
		DominozPizzaImpl dm = new DominozPizzaImpl();
		dm.populateData("dish.txt","location.txt", l, s);
		System.out.println("--------------Dish---------------");
		for(Dish d: l) {
			System.out.println(d);
		}
		System.out.println("---------------Location-------------");
		for(Location loc: s) {
			System.out.println(loc);
		}
		System.out.println("------------Calculations for Total Cost------------------");
		List<Order> list = dm.calculateOrder("order.txt", l, s);
	}

}
