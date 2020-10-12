package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomepage;
import ObjectRepository.RediffLoginpage;
import ObjectRepository.RediffLoginpage_Pageobjectpatteren;

public class Loginapplication {
	
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       // RediffLoginpage rl=new RediffLoginpage(driver);
        RediffLoginpage_Pageobjectpatteren rl=new RediffLoginpage_Pageobjectpatteren(driver);
        rl.emailid().sendKeys("thirupathi63@rediffmail.com");
        rl.password().sendKeys("Tirupati");
        rl.signin().click();
        rl.homelink().click();
       RediffHomepage rh=new RediffHomepage(driver); 
        Thread.sleep(5000);
        rh.shopping().click();
        Thread.sleep(5000);
        rh.Search().sendKeys("watches");
        rh.SearchButton().click();
        
	}

}
