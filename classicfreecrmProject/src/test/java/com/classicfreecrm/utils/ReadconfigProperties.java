package com.classicfreecrm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadconfigProperties {
	static Properties prop;
	
	public static String readconfig() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\test\\java/com\\classicfreecrm\\config\\config.properties");
		prop.load(fis);
		
		
		return null;
	}

}
