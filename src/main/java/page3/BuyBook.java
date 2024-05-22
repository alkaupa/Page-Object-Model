package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyBook {
WebDriver driver; 
	
	// constructor
	
	public BuyBook (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//input[@value='Buy']")
	private WebElement buy;

	
	public WebElement getBuy() {
		return buy;
	}

	// Business methods

	

	public void click() {
		buy.click();
	}
	


}
