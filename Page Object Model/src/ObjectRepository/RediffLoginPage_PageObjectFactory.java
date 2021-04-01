package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage_PageObjectFactory {

WebDriver driver;
	
	public RediffLoginPage_PageObjectFactory(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=".//*[id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(className="f12")
	WebElement homepage;		
	
	
		public WebElement EmailId()
		{
			return username;
		}
		
		public WebElement Password()
		{
			return password;
		}
		public WebElement Submit()
		{
			return go;
		}
		public WebElement Home()
		{
			return homepage;
		}
}


