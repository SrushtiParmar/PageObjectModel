package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffLoginPage;

public class LoginApplication {
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		RediffLoginPage lp = new RediffLoginPage(driver);
		
		lp.EmailId().sendKeys("abc@gmail.com");
		lp.Password().sendKeys("12345");
		lp.Submit().click();
		lp.Home().click();
		
		RediffHomePage hp = new RediffHomePage(driver);
		
		hp.Search().sendKeys("Home Decor");
		hp.Submit().click();
	}

}
