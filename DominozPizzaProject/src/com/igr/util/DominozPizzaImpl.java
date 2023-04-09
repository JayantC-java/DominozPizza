package com.igr.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;
import com.igr.bean.Order;

public class DominozPizzaImpl implements DominozPizza {

	@Override
	public void populateData(String dishFile, String locationFile, List<Dish> dishs, Set<Location> locations) {
		// TODO Auto-generated method stub
           File f = new File(dishFile);
		
		try {
			Scanner scan = new Scanner(f);
			
			while(scan.hasNext()) {
				String line = scan.nextLine();
				String[] split = line.split(",");
				
				Dish d = new Dish();
				d.setDishId(Integer.parseInt(split[0]));
				d.setDishName(split[1]);
				d.setDishCost(Integer.parseInt(split[2]));
				d.setTimeToCook(Integer.parseInt(split[3]));
				
				dishs.add(d);
	
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f1 = new File(locationFile);
		
		try {
			Scanner scan = new Scanner(f1);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				String[] split=line.split(",");
				
			
				Location l= new Location();
				l.setLocationCode(Integer.parseInt(split[0].trim()));
				l.setLocationDistance(Integer.parseInt(split[1].trim()));
				l.setLocationTime(Double.parseDouble(split[2].trim()));
				locations.add(l);}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

	@Override
	public List<Order> calculateOrder(String orderFile, List<Dish> dishs, Set<Location> locations) {
		// TODO Auto-generated method stub
		File f2 = new File(orderFile);
		List<Order> accept = new ArrayList<Order>();
		List<Order> discard = new ArrayList<Order>();
		List<Order> list1 = new ArrayList<Order>();
		
		try {
			Scanner sc2 = new Scanner(f2);
			while(sc2.hasNext()) {
				String line = sc2.nextLine();
				String[] split = line.split(",");
				Order o1 =  new Order();
				o1.setDishId(Integer.parseInt(split[0].trim()));
				o1.setLocationId(Integer.parseInt(split[1].trim()));
				list1.add(o1);
				
				for(Dish d: dishs) {
					for(Location l: locations) {
						if(l.getLocationCode() == o1.getLocationId() && d.getDishId() == o1.getDishId()) {
							double totalCost = d.getDishCost() + l.getLocationDistance() * 1;
							o1.setTotalCost(totalCost);
							if(d.getTimeToCook() + l.getLocationTime() <= 30) {
								accept.add(o1);
							}
							else
							{
								discard.add(o1);
							}
						}
					}
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------------Accepted Order--------------------");
		for (Order order: accept) {
			System.out.println(order);
		}
		System.out.println("---------------------Discarded Order--------------------");
		for (Order order: discard) {
			System.out.println(order);
		}
		return list1;
	}

	@Override
	public void freeDelivery(List<Order> orders, List<Dish> dishs, Set<Location> locations) {
		// TODO Auto-generated method stub
		List<Order> q = new ArrayList<Order>();
		
		for(Order o: orders) {
			for(Dish d: dishs) {
				for(Location l: locations) {
					if(d.getDishId()==o.getDishId()&& l.getLocationCode()==l.getLocationCode()) {
						if(l.getLocationDistance()<10 && o.getTotalCost()>200) {
							q.add(o);
							
						}
						else {
							q.add(o);
							
							System.out.println(o+"NOT freeDelivery");
						}
					}
				}
			}
		}
		
	}
}

	

	
	
	

