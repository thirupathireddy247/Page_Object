package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {
	WebDriver driver;
	
	public RediffHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Shopping=By.xpath("//*[@title='Online Shopping']");
	By Searchbox=By.id("srchword");
	By Searchbutton=By.className("newsrchbtn");
	
		public WebElement shopping()
	{
		return driver.findElement(Shopping);
	}
	public WebElement Search()
	{
		return driver.findElement(Searchbox);
	}
	public WebElement SearchButton()
	{
		return driver.findElement(Searchbutton);
	}
	
}
