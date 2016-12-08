import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination 
{
	 BaseTest b=new BaseTest();;
     HomePage hp;
     Womenpage wp;
     SareePage sp;
    
@Given("^i enter eshopper url$")
public void i_enter_eshopper_url() throws Throwable {
    
    hp=b.startBrowser();//new HomePage();
}

@When("^i verified homePage url$")
public void i_verified_homePage_url() throws Throwable {
  hp.verifyUrl();
}

@When("^i clicked women menu bar$")
public void i_clicked_women_menu_bar() throws Throwable {
    wp=hp.clickWomen();
}

@When("^i mouseOver in Women$")
public void i_mouseOver_in_Women() throws Throwable {
   Thread.sleep(2000);
	hp.hover();
}

@When("^i click on saree submenu$")
public void i_click_on_saree_submenu() throws Throwable {
   sp=hp.clickSareeSubMenu();
}

@When("^i click first product$")
public void i_click_first_product() throws Throwable {
    sp.clickFirstProduct();
}

@When("^i click buy now$")
public void i_click_buy_now() throws Throwable {
   System.out.println("clicked buy"); 
   
   
}
@Then("^close browser$")
public void close_browser() throws Throwable {
   b.end();
}


}