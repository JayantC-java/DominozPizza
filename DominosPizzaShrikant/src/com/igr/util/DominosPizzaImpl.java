package com.igr.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;

public class DominosPizzaImpl implements DominosPizza{

	@Override
	public void populateData(String dishFile, String locationFile, List<Dish> dish, Set<Location> locations) {
		// TODO Auto-generated method stub
		File f=new File(dishFile);
	//	ObjectInput input=null;
		try {
			Scanner sc=new Scanner(f);
			while(sc.hasNext()) {
			String line=sc.nextLine();
			String[]split=line.split(",");
			Dish d=new Dish();
			
			d.setDishId(Integer.parseInt(split[0].trim()));
			d.setDishName(split[1].trim());
			d.setCost(Double.parseDouble(split[2].trim()));
			d.setTimeToCook(Integer.parseInt(split[3].trim()));
			dish.add(d);
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				File f1=new File(locationFile);
				try {
					Scanner sc1=new Scanner(f1);
					while (sc1.hasNext());
					String line=sc1.nextLine();
					String []split1=line.split(",");
					Location l=new Location();
					
					l.setLocationId(Integer.parseInt(split1[0].trim()));
					l.setLocationDist(Integer.parseInt(split1[1].trim()));
					l.setLocationTime(Integer.parseInt(split1[2].trim()));
					
					locations.add(l);
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	}

}
