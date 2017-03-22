package com.page;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	Base b;
	 HomePage hp;
	 WomenPage wp;
	  Clothing cl;
	@Before
	public void start()
	{
		   b=new Base();
		   b.openBrowser();
		   hp= b.nevigateURL();
	}
	@After
	public void teardown()
	{
		b.end();
	}
	
	@Given("^i nevigate to eshopper domain$")
	public void i_nevigate_to_eshopper_domain() throws Throwable {
//	  System.out.println("open");
//	  b=new Base();
//	   b.openBrowser();
//	   hp= b.nevigateURL();
//	   Thread.sleep(2000);
	}

	@When("^i click on women menu bar$")
	public void i_click_on_women_menu_bar() throws Throwable {
		  Thread.sleep(2000);
		wp=hp.clickWomen();
	}

	@When("^i click on clothing sub catagory$")
	public void i_click_on_clothing_sub_catagory() throws Throwable {
		  Thread.sleep(2000);
		cl= wp.clickClothing();
	}

	@When("^i click on first product$")
	public void i_click_on_first_product() throws Throwable {
	    System.out.println("clothing");
	}

	@Then("^i should nevigate to PD page$")
	public void i_should_nevigate_to_PD_page() throws Throwable {
	    System.out.println("pr page");
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    System.out.println("closed");
	    b.end();
	}
	@When("^i Validate search engine using \"([^\"]*)\"$")
	public void i_Validate_search_engine_using(String arg1) throws Throwable {
	    hp.seach(arg1);
	    Thread.sleep(3000);
	}

	@Then("^i should get relative product$")
	public void i_should_get_relative_product() throws Throwable {
	    System.out.println("validated");
	}

@When("^i click on register button$")
public void i_click_on_register_button() throws Throwable {
    Thread.sleep(2000);
	hp.clickregister();
	Thread.sleep(2000);
}

@When("^i fill up registration form$")
public void i_fill_up_registration_form(DataTable arg1) throws Throwable {
	Thread.sleep(2000);
	List<List<String>> data=arg1.raw();  
hp.fill(data.get(1).get(0));
Thread.sleep(2000);
}

@Then("^i should be registered successfully$")
public void i_should_be_registered_successfully() throws Throwable {
    System.out.println("successfull");
}

}
