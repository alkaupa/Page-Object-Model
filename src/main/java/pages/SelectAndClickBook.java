package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SelectAndClickBook {
	
WebDriver driver; 
	
	// constructor
	
	public SelectAndClickBook (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//a[text()='Paper Back ']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//a[text()='English ']")
	private WebElement Languagecheckbox;
	
	@FindBy(xpath = "//img[@alt='House of Flame and Shadow']")
	private WebElement clickbook;

	
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	public WebElement getLanguagecheckbox() {
		return Languagecheckbox;
	}

	public WebElement getClickbook() {
		return clickbook;
	}
	
	
	
	// business method
    
	
	
	public void click() {
		
		checkbox.click();
		
		Languagecheckbox.click();
		
		clickbook.click();
	}
	
	
}
