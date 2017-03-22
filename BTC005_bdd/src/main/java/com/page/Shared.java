package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shared 
{
	FirefoxDriver dr;
	Shared(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public void click(WebElement ele)
	{
		ele.click();
	}

}
