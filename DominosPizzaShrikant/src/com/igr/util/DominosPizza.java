package com.igr.util;

import java.util.List;
import java.util.Set;

import com.igr.bean.Dish;
import com.igr.bean.Location;

public interface DominosPizza {
	public void populateData(String dishFile, String locationFile, List<Dish>dish, Set<Location>locations);

}
