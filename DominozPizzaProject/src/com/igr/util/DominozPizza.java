package com.igr.util;

import java.util.List;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;
import com.igr.bean.Order;

public interface DominozPizza {
	public void populateData(String dishFile, String locationFile, List<Dish>dish, Set<Location>locations);
//	void calculateLocationForDistance(List<Dish> dishs,Set<Location> locations );
	List<Order> calculateOrder(String orderFile,List<Dish> dishs,Set<Location> locations);
	void freeDelivery(List<Order> orders,List<Dish> dishs,Set<Location> locations);
	

}
