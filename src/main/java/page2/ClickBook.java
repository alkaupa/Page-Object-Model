package page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickBook {
	
WebDriver driver; 
	
	// constructor
	
	public ClickBook (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//a[text()='Paper Back ']")
	private WebElement paperbackcheckbox;
	
	@FindBy(xpath = "//a[text()='Tamil ']")
	private WebElement tamillanguage;
	
	@FindBy(xpath = "//img[@alt='The Magic']")
	private WebElement themagic;

	

	

	// Business methods

	public WebElement getPaperbackcheckbox() {
		return paperbackcheckbox ;
	}





	public WebElement getTamillanguage() {
		return tamillanguage;
	}





	public WebElement getThemagic() {
		return themagic;
	}




	// Business methods
	
	public void click() {
		
		paperbackcheckbox.click();
		
		tamillanguage.click();
		
		themagic.click();
		
		
	}
	


}
