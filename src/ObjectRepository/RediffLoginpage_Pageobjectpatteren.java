	package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpage_Pageobjectpatteren {
	WebDriver driver;
	
	public RediffLoginpage_Pageobjectpatteren(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login1")
	WebElement username;
	@FindBy(name="passwd")
	WebElement password;
	@FindBy(className="signinbtn")
	WebElement Signin;
	@FindBy(xpath="//*[text()='rediff.com']")
	WebElement Homelink;
	@FindBy(xpath="//*[@title='Online Shopping']")
	WebElement Shopping;
	@FindBy(id="srchword")
	WebElement Searchbox;
	@FindBy(className="newsrchbtn")
	WebElement Seaarchbutton;
	
	public WebElement emailid()
	{
		return username;
	}
	public WebElement password()
	{
		return password;
	}
	public WebElement signin()
	{
		return Signin;
	}
	public WebElement homelink()
	{
		return Homelink;
	}
		
	/*
	 * By username=By.id("login1"); By password=By.name("passwd"); By
	 * signin=By.className("signinbtn"); By
	 * Homelink=By.xpath("//*[text()='rediff.com']"); By
	 * Shopping=By.xpath("//*[@title='Online Shopping']"); By
	 * Searchbox=By.id("srchword"); By Searchbutton=By.className("newsrchbtn");
	 * 
	 * public WebElement Emailid() { return driver.findElement(username); } public
	 * WebElement Password()
	 * 
	 * { return driver.findElement(password); } public WebElement signin() { return
	 * driver.findElement(signin); } public WebElement Homelink() { return
	 * driver.findElement(Homelink); } public WebElement shopping() { return
	 * driver.findElement(Shopping); } public WebElement Search() { return
	 * driver.findElement(Searchbox); } public WebElement SearchButton() { return
	 * driver.findElement(Searchbutton); }
	 */
}
