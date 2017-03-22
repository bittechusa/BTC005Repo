package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {
	FirefoxDriver dr;
	Shared sh;
	@FindBy(xpath="//b[text()='Clothing']")
	WebElement clothing;
	WomenPage(FirefoxDriver dr)
	{
		this.dr=dr;
		
		PageFactory.initElements(dr, WomenPage.this);
	}
	public Clothing clickClothing()
	{
		sh=new Shared(dr);
		sh.click(clothing);
		return new Clothing();
	}
}
