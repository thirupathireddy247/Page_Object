package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.id("login1");
	By password=By.name("passwd");
	By signin=By.className("signinbtn");
	By Homelink=By.xpath("//*[text()='rediff.com']");
	By Shopping=By.xpath("//*[@title='Online Shopping']");
	By Searchbox=By.id("srchword");
	By Searchbutton=By.className("newsrchbtn");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	public WebElement Password()

	{
		return driver.findElement(password);
	}
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	public WebElement Homelink()
	{
		return driver.findElement(Homelink);
	}
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
