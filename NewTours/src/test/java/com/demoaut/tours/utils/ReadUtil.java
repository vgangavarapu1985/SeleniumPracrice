package com.demoaut.tours.utils;

import java.io.FileReader;
import java.util.Properties;

public class ReadUtil {

	Properties prop;

	public ReadUtil(String filePath) {
		try {
			FileReader fr = new FileReader(filePath);
			prop = new Properties();
			prop.load(fr);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String getPropertyValue(String key) 
	{
		String property = prop.getProperty(key, "");
				
		return (property);
	}

}
