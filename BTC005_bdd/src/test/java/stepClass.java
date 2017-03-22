import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepClass {
	WebDriver dr;
	@Before
	public void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
	    dr=new FirefoxDriver();
	}
	@Before("@Login")
	public void xy(){
		System.out.println("Run only for login Scenerio");
	}
	@After("@Login")
	public void xy1(){
		System.out.println("Run after login Scenerio");
	}
	@Given("^i nevigate to facebook homepage$")
	public void i_nevigate_to_facebook_homepage() throws Throwable {

	
		dr.get("http://www.facebook.com");
	}
	@When("^i entered my userId \"([^\"]*)\"$")
	public void i_entered_my_userId(String arg1) throws Throwable {
		 dr.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^i entered my password \"([^\"]*)\"$")
	public void i_entered_my_password(String arg1) throws Throwable {
		 dr.findElement(By.id("pass")).sendKeys(arg1); 
	}


	@When("^i entered my userId$")
	public void i_entered_my_userId() throws Throwable {
	    dr.findElement(By.id("email")).sendKeys("userid");
	}

	@When("^i entered my password$")
	public void i_entered_my_password() throws Throwable {
		 dr.findElement(By.id("pass")).sendKeys("userid");
	}

	@When("^i clicked on login button$")
	public void i_clicked_on_login_button() throws Throwable {
		// dr.findElement(By.id("u_0_q")).click();
	}

	@Then("^i should nevigate to profile page$")
	public void i_should_nevigate_to_profile_page() throws Throwable {
	  //dr.quit();
	//Assert.assertTrue(dr.findElement(By.xpath("")).getText().equals("shahidul")); 
	}
	@When("^i fill up sign up form$")
	public void i_fill_up_sign_up_form(DataTable arg1) throws Throwable {
	 List<List<String>> alpha= arg1.raw();
	 System.out.println(alpha);
	 dr.findElement(By.id("u_0_1")).sendKeys(alpha.get(1).get(0));
	 dr.findElement(By.id("u_0_3")).sendKeys(alpha.get(1).get(1));
	 dr.findElement(By.id("u_0_6")).sendKeys(alpha.get(1).get(2));
	 dr.findElement(By.id("u_0_9")).sendKeys(alpha.get(1).get(3));
	 dr.findElement(By.id("u_0_d")).sendKeys(alpha.get(1).get(4));
	 
	}

	@When("^i clicked on sign up  button$")
	public void i_clicked_on_sign_up_button() throws Throwable {
	   
	}

	@Then("^i should be registered$")
	public void i_should_be_registered() throws Throwable {
	    
	}
	@After
	public void closeBrowser(){
		dr.quit();
	}
	
	
	

}
