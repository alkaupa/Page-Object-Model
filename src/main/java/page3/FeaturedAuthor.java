package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedAuthor {
	
WebDriver driver; 
	
	// constructor
	
	public FeaturedAuthor (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "(//a[text()='Featured Authors'])[1]")
	private WebElement featureauthor;

	public WebElement getFeatureauthor() {
		return featureauthor;
	}
	
	//Business Method
	
	public void click() {
		
		featureauthor.click();
	}
	

	


}
