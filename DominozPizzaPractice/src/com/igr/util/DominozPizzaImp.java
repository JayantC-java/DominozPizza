package com.igr.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import com.igr.bean.Dish;

public class DominozPizzaImp implements DominozPizza {

	@Override
	public void populateData(String dishFile, List<Dish> dish) {
		// TODO Auto-generated method stub
		File f = new File(dishFile);
		try {
			Scanner sc = new Scanner(f);
			
			while (sc.hasNext()) {
				String line = sc.nextLine();
				String[] split = line.split(",");
				Dish d = new Dish();
				d.setDishId(Integer.parseInt(split[0]));
				d.setDishName(split[1]);
				d.setCost(Double.parseDouble(split[2]));
				d.setTimeTocook(Integer.parseInt(split[3]));
				dish.add(d);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
