package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StephenCoonts {
	
WebDriver driver; 
	
	// constructor
	
	public StephenCoonts (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//a[text()='Stephen Coonts']")
	private WebElement author;

	
	
	
	
	public WebElement getAuthor() {
		return author;
	}


	//Business Method
	public void click() {
		
		author.click();
	}
	


}
