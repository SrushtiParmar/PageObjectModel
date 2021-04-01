package ObjectRepository;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

		By username=By.xpath(".//*[@id='login1']");
		By password= By.name("passwd");
		By go=By.name("proceed");
		By homepage=By.className("f12");
		
		public WebElement EmailId()
		{
			return driver.findElement(username);
		}
		
		public WebElement Password()
		{
			return driver.findElement(password);
		}
		public WebElement Submit()
		{
			return driver.findElement(go);
		}
		public WebElement Home()
		{
			return driver.findElement(homepage);
		}
}
