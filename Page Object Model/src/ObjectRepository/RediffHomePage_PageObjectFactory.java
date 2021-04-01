package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage_PageObjectFactory {

WebDriver driver;
	
	public RediffHomePage_PageObjectFactory(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="srchword")
	WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	public WebElement Search()
	{
		return search;
	}
	
	public WebElement Submit()
	{
		return submit;
	}
}


