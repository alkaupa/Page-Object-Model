package page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSeller {
	
WebDriver driver; 
	
	// constructor
	
	public BestSeller (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "(//a[text()='Best sellers'])[1]")
	private WebElement bestseller;

	
	public WebElement getBestseller() {
		return bestseller;
	}

	// Business methods

	public void click() {
		bestseller.click();
	}
	


}
