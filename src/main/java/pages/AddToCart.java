package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {
	
WebDriver driver; 
	
	// constructor
	
	public AddToCart (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//a[@id='btnAddtocart']")
	private WebElement Addtocart;
	
	@FindBy(xpath = "//a[@id='btnGotocart']")
	private WebElement Gotocart;

	public WebElement getAddToCart() {
		return Addtocart;
	}

	
	public WebElement getGoToCart() {
		return Gotocart;
	}

	// business method
    
		Select s;
		
		public void click() {
			
			Addtocart.click();
			
			Gotocart.click();
			
			
		}

	
	
	
	
	

}
