package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewArrivalPage {
	
	WebDriver driver; 
	
	// constructor
	
	public NewArrivalPage (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "(//a[text()='New Arrivals'])[1]")
	private WebElement NewArrival;

	public WebElement getNewArrival() {
		return NewArrival;
	}

	// Business methods
	
	public void click() throws InterruptedException {
		NewArrival.click();
		Thread.sleep(2000);
	}
	

	
	
    
	
}
