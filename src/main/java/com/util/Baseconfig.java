package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Baseconfig {

	public static String getconfig(String testdata) throws IOException {
		//get filePath 
		String filePath = "./Enviroments/qa.properties";
		//make it stream
		FileInputStream fis = new FileInputStream(filePath);
		//make it readable
		Properties pro = new Properties();
		pro.load(fis);
		// get the value
		String value = pro.get(testdata).toString();
		
		
		return value;
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println(Baseconfig.getconfig("url"));
		System.out.println(Baseconfig.getconfig("username"));
		System.out.println(Baseconfig.getconfig("password"));
	}
}
