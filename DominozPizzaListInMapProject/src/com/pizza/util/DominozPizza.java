package com.pizza.util;

import java.util.List;

import com.pizza.bean.Type;

public interface DominozPizza {
	List<Type> populateData(String toppingFile, String priceFile);

}
