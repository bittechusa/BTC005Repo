import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public WebDriver dr;
	
	public HomePage startBrowser()
	{
		System.out.println("shahid");
		System.setProperty("webdriver.gecko.driver", "/Users/bittech/Downloads/geckodriver");
		dr=new FirefoxDriver();
		
		dr.get("http://www.eshopper24.com");
		return new HomePage(dr);
	}
	public void end() throws InterruptedException
	{
		Thread.sleep(3000);
		dr.quit();
	}

}
