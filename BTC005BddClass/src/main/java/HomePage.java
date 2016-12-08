import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
WebDriver dr;
public HomePage(WebDriver x)
{
	dr=x;
	}
	public void verifyUrl()
	{
		System.out.println(dr.getCurrentUrl().contains("eshopper"));
	}
	public Womenpage clickWomen()
	{
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a/b")).click();
		return new Womenpage();
		
	}
	public void hover() throws InterruptedException
	{
		WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/a"));
		Actions a=new Actions(dr);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
	}
	public SareePage clickSareeSubMenu()
	{
		dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[2]/div/div[1]/ul/li[1]/a")).click();
		return new SareePage(dr);
	}
}
