package page3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAG {
	
WebDriver driver; 
	
	// constructor
	
	public QAG (WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);// I want to initialise my driver(this-> class driver)
		
		// All the elements in this class are being initialised.
		
	}
	
	// Defining my Page objects
	
	@FindBy(xpath = "//select[@id='ctl00_phBody_ProductDetail_CartBoxWeb_ddlQty']")
	private WebElement Quantityclick;
	
	@FindBy(xpath = "//option[text()='2']")
	private WebElement Number ;
	
	@FindBy(xpath = "//a[@id='btnAddtocart']")
	private WebElement addtocart ;
	
	@FindBy(xpath = "//a[@id='btnGotocart']")
	private WebElement gotocart ;

	public WebElement getQuantityclick() {
		return Quantityclick;
	}

	public WebElement getNumber() {
		return Number;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getGotocart() {
		return gotocart;
	}


	

	//Business Method

	public void click() {
		
		Quantityclick.click();
		
		Number.click();
		
		addtocart.click();
		
		gotocart.click();
		
		
	}
	


}
