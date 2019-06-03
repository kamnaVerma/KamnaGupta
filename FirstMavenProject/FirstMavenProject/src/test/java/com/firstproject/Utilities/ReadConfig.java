package com.firstproject.Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {
	 public Properties pro;
	 public ReadConfig() {
		
		 File src = new File("./Configurations/config.properties");
		 
		 try {
			FileInputStream fis = new FileInputStream(src);
			 pro = new Properties();
			 pro.load(fis);
			 
		} 
		 catch (Exception e) 
		 {
			System.out.println("Error Message"+e.getMessage());
		}

	 }
	 
	 public String getWebAppUrl(){
		 
		 String appUrl = pro.getProperty("url");
		 return appUrl;
		 	 
	 }
	 
	 public String getUname(){
		 
		 String uname = pro.getProperty("username");
		 return uname;
		 	 
	 }
 
	 public String getPwd(){
	 
		 String pwd = pro.getProperty("password");
		 return pwd;
	 	 
	 }
 
	 public String getChromeDriver(){
	 
		 String chromedriver = pro.getProperty("chromedriver");
		 return chromedriver;
	 	 
	 }

}
