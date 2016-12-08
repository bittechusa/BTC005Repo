package com.bit.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
WebDriver dr;
@Given("^i enter in facebook url$")
public void i_enter_in_facebook_url() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
	dr=new FirefoxDriver();
	dr.get("http://www.facebook.com");
}

@When("^i type userid is \"([^\"]*)\"$")
public void i_type_userid_is(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  dr.findElement(By.id("email")).sendKeys(arg1);
}

@When("^i type password is \"([^\"]*)\"$")
public void i_type_password_is(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 dr.findElement(By.id("pass")).sendKeys(arg1);
}

@When("^i click in login button$")
public void i_click_in_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 dr.findElement(By.id("email")).click();
}

@Then("^i should able to login$")
public void i_should_able_to_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

}
