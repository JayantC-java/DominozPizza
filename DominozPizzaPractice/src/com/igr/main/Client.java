package com.igr.main;

import java.util.ArrayList;
import java.util.List;

import com.igr.util.DominozPizzaImp;

public class Client {
	public static void main(String[] args) {
		List l = new ArrayList();
		DominozPizzaImp dm = new DominozPizzaImp();
		dm.populateData("dish.txt", l);
		
		System.out.println(l);
		
	}

}
