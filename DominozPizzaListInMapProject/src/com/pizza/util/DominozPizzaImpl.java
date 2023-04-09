package com.pizza.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.pizza.bean.Key;
import com.pizza.bean.Price;
import com.pizza.bean.Topping;
import com.pizza.bean.Type;

public class DominozPizzaImpl implements DominozPizza {

	@Override
	public List<Type> populateData(String toppingFile, String priceFile) {
		// TODO Auto-generated method stub
		Map<Topping,Price> map = new HashMap<Topping,Price>();
		List<Price> priceList = new ArrayList<Price>();
		List<Type> typeList = new ArrayList<Type>();
		for(Key k : Key.values()) {
			typeList.add(new Type(k, new HashMap<Topping,Price>()));
			 
			 
			
		}
			
			
		
		
		return null;
	}

}
