package com.juaracoding.cucumber4.drivers;

import com.juaracoding.cucumber4.drivers.Chrome;
import com.juaracoding.cucumber4.drivers.DriverStrategy;
import com.juaracoding.cucumber4.drivers.Firefox;
import com.juaracoding.cucumber4.utlis.Constants;

public class DriverStrategyImplementator {
	
public static DriverStrategy chooseStrategy(String strategy) {
		
		switch(strategy) {
		case Constants.CHROME:
			return new Chrome();
			
		case Constants.FIREFOX:
			return new Firefox();
			
		default:
			return null;
		}
		
	}
	

}
