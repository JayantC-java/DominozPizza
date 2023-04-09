package com.igr.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;
import com.igr.util.DominosPizzaImpl;

public class Client {
	
	public static void main(String[] args) {
		List<Dish>l=new ArrayList <Dish>();
		Set<Location> s=new HashSet<Location>();
		
		DominosPizzaImpl dm=new DominosPizzaImpl();
		dm.populateData("Dish.txt", "Location.txt", l, s);
		
		for (Dish object : l) {
			System.out.println(object);
		}
		
		for (Location location : s) {
			System.out.println(s);
			
		}
		
		
	}

}
