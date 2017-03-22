package com.page;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	FirefoxDriver dr;
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
	    dr=new FirefoxDriver();
	 
	}
	public HomePage nevigateURL()
	{
		dr.get("http://www.eshopper24.com");
		return new HomePage(dr);
	}
	public void end()
	{
		dr.quit();
	}

}
