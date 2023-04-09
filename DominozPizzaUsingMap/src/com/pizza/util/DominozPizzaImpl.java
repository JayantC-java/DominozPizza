package com.pizza.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.pizza.bean.Order;
import com.pizza.bean.PizzaType;
import com.pizza.bean.Price;
import com.pizza.bean.Topping;

public class DominozPizzaImpl implements DominozPizza {

	@Override
	public Map<PizzaType, Map<Topping, Price>> populateData(String toppingFile, String priceFile) {
		// TODO Auto-generated method stub
		Map<PizzaType, Map<Topping, Price>> map = new HashMap<>();
		Map<Topping,Price> smap = new HashMap<>();
		for(PizzaType k: PizzaType.values()) {
			map.put(k, new HashMap<Topping,Price>());
			
			List<Price> priceList = new ArrayList<>();
			File f = new File(priceFile);
			try {
				Scanner sc = new Scanner(f);
				while(sc.hasNext()) {
					String[] split = sc.nextLine().split(",");
					Price p = new Price(Integer.parseInt(split[0].trim()), Double.parseDouble(split[1].trim()));
					priceList.add(p);
					System.out.println(p);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			File f1 = new File(toppingFile);
			try {
				Scanner sc2 = new Scanner(f1);
				while(sc2.hasNext()) {
					String[]splt = sc2.nextLine().split(",");
					
					Topping top = new Topping(Integer.parseInt(splt[0].trim()),Integer.parseInt(splt[1].trim()),
							splt[2].trim(), Double.parseDouble(splt[3].trim()));
					System.out.println(top);
					for(Price p : priceList) {
						if(p.getToppingId() == top.getToppingId()) {
							smap.put(top, p);
						}
					}
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			
		}
		
		for(Entry<PizzaType, Map<Topping,Price>> mainMapEntrySet : map.entrySet()) {
			for (Entry<Topping,Price> smapEntrySet : smap.entrySet()) {
				if(mainMapEntrySet.getKey().equals(PizzaType.VegPizza) && smapEntrySet.getKey().getKeyId() == 1) {
					mainMapEntrySet.getValue().put(smapEntrySet.getKey(), smapEntrySet.getValue());
					}
				else if (mainMapEntrySet.getKey().equals(PizzaType.NonVegPizza) &&
						smapEntrySet.getKey().getKeyId() ==2) {
					mainMapEntrySet.getValue().put(smapEntrySet.getKey(), smapEntrySet.getValue());
				}
				
				
			}
		}
		System.out.println(smap);
		System.out.println(map);
		return map;
	}

	@Override
	public List<Order> calculateOrder(String orderFile, Map<PizzaType, Map<Topping, Price>> map) {
		// TODO Auto-generated method stub
		List<Order> ord = new ArrayList<>();
		
		File f3 = new File(orderFile);
		
		try {
			Scanner sc =  new Scanner(f3);
			while(sc.hasNext()) {
				String[] sp = sc.nextLine().split(",");
				
				Order o = new Order(Integer.parseInt(sp[0].trim()), Integer.parseInt(sp[1].trim()),
						sp[2].trim(), sp[3].trim(),0);
				ord.add(o);
				for(Entry<PizzaType,Map<Topping,Price>> mainMapEntry : map.entrySet()) {
					if(mainMapEntry.getKey().equals(PizzaType.VegPizza) && o.getKeyId() == 1) {
						for(Entry<Topping,Price> smapEntry : mainMapEntry.getValue().entrySet()) {
							if(o.getToppingId() == smapEntry.getKey().getToppingId()) {
								o.setCost(smapEntry.getValue().getCost());
							}
						}
					}
					for(Entry<Topping,Price> smapEntry : mainMapEntry.getValue().entrySet()) {
						if (smapEntry.getKey().getToppingId() == o.getToppingId()) {
							o.setCost(smapEntry.getValue().getCost());
						}
						
					}
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
//		System.out.println(ord);
				return ord;
	
	}

	@Override
	public Order chooseHighestCostOrder(List<Order> order) {
		// TODO Auto-generated method stub
		Collections.sort(order);
		//System.out.println();
		return order.get(0);
		
	}

	@Override
	public boolean checkOrder(Order order, Map<PizzaType, Map<Topping, Price>> map) {
		// TODO Auto-generated method stub
		for(Entry<PizzaType, Map<Topping,Price>> mainEntry : map.entrySet()) {
			for(Entry<Topping,Price> smapEntry : mainEntry.getValue().entrySet()) {
				if(smapEntry.getKey().getKeyId() == order.getKeyId() && 
						smapEntry.getKey().getToppingId() == order.getToppingId()
						&& smapEntry.getKey().getToppingName().equals(order.getToppingName())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public double calculateBill(Order order) {
		// TODO Auto-generated method stub
		double totalCost = order.getCost() + (0.1 * order.getCost());
				if(totalCost > 1000) {
					totalCost = totalCost - (0.05 * order.getCost());
				}
		return totalCost;
	}
	
	
}
