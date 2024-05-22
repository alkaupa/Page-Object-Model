package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArtOfwar {
WebDriver driver; 
	
	// constructor
	
	public ArtOfwar (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(linkText = "The Art Of War")
	private WebElement artofwarbook;

	public WebElement getArtofwarbook() {
		return artofwarbook;
	}

	//Business Method

	public void click() {
		
		artofwarbook.click();
	}
	


}
