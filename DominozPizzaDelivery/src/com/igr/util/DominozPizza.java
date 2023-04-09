package com.igr.util;

import java.util.List;
import java.util.Set;

import javax.tools.DocumentationTool.Location;

import com.igr.bean.Dish;

public interface DominozPizza {
	public void populateData(String dishFile, List<Dish>dish, 
			String locationFile, Set<Location>locations);

}
