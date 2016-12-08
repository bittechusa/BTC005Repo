import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SareePage 
{
	WebDriver dr;
	public SareePage(WebDriver x)
	{
		dr=x;
		}
	
	public ProductDetailPage clickFirstProduct()
	{
		dr.findElement(By.xpath("html/body/div[4]/div[2]/div/div/aside/figure[1]/div/div/div/div[2]/ul/li[1]/a")).click();
		return new ProductDetailPage();
	}

}
