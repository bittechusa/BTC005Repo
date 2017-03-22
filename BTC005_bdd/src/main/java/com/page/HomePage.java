package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	FirefoxDriver dr;
	Shared sh;
	@FindBy(xpath="//b[text()='Women']")
	WebElement theWomen;
	HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
		
		PageFactory.initElements(dr, HomePage.this);
	}
	public WomenPage clickWomen()
	{
		sh=new Shared(dr);
		sh.click(theWomen);
		return new WomenPage(dr);
	}
	public void seach(String s)
	{
		dr.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys(s);
	}
	public void clickregister()
	{
		
		dr.findElement(By.xpath("//a[text()='Register']")).click();
	}
	public void fill(String s)
	{
		dr.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(s);
	}

}
