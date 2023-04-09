package com.igr.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.igr.bean.Dish;
import com.psl.bean.Location;

public class DominozPizzaImp implements DominozPizza {

	
	@Override
	public void populateData(String dishFile, List<Dish> dish, 
			String locationFile, Set<Location>locations) {
		// TODO Auto-generated method stub
		File F = new File(dishFile);
		try {
			Scanner sc = new Scanner(F);
			
			while (sc.hasNext()){
				String line = sc.nextLine();
				String[] split = line.split(",");
				Dish d = new Dish();
				d.setDishId(Integer.parseInt(split[0].trim()));
				d.setDishName(split[1].trim());
				d.setCost(Integer.parseInt(split[2].trim()));
				d.setTimeTocook(Integer.parseInt(split[3].trim()));
				dish.add(d);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{sc.close();}
		
	
		
	}

	@Override
	public void populateData(String dishFile, List<Dish> dish, String locationFile,
			Set<javax.tools.DocumentationTool.Location> location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void populateData(String dishFile, List<Dish> dish, String locationFile,
			Set<javax.tools.DocumentationTool.Location> location) {
		// TODO Auto-generated method stub
		
	}

}
