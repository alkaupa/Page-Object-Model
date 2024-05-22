package page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveBooks {
	
WebDriver driver; 
	
	// constructor
	
	public RemoveBooks (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//a[@id='ctl00_phBody_BookCart_lvCart_ctrl0_imgDelete']")
	private WebElement removebook1;
	
	@FindBy(xpath = "//a[text()='Remove']")
	private WebElement removebook2;

	
	

	

	public WebElement getRemovebook1() {
		return removebook1;
	}




	public WebElement getRemovebook2() {
		return removebook2;
	}


	// Business methods


	public void click() {
		
		removebook1.click();
		
		removebook2.click();
	}
	


}
