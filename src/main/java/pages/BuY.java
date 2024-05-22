package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BuY {
	
WebDriver driver; 
	
	// constructor
	
	public BuY (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//input[@value='Buy']")
	private WebElement Buy;
	
	public WebElement getBuy() {
		return Buy;
	}

	

	// business method
    
		

		Select s;
		
		public void click() {
			
			Buy.click();
			
			
			
			
		}


}
