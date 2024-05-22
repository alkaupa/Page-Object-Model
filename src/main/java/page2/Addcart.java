package page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addcart {
	
WebDriver driver; 
	
	// constructor
	
	public Addcart (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//a[@id='btnAddtocart']")
	private WebElement addtocart;
	
	@FindBy(xpath = "//a[@id='btnGotocart']")
	private WebElement gotocart;

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getGotocart() {
		return gotocart;
	}

	// Business method
	
	public void click() {
		addtocart.click();
		
		gotocart.click();
	}

	

	


}
