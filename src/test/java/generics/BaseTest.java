package generics;




import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class BaseTest { // This is my parent class

	protected WebDriver driver;
	

	

	
	@BeforeClass
	public void start() throws IOException  {
		
		
		driver = new ChromeDriver();
		
    	 Screenshot.setDriver(driver);
		 
		 Properties pr = new Properties();
		 

		 
		 FileInputStream file = new FileInputStream("C:\\Users\\alkau\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\.metadata\\.metadata\\HandsOnPOM\\src\\test\\resources\\config.properties");
		 
		 pr.load(file);
		 
		 String url = pr.getProperty("url");
		 
		 driver.get(url);
		 Screenshot.capture(1);
		 
		

		 
//		   assertion To Check Url
			String Actualurl = driver.getCurrentUrl();
			String Expectedurl = "https://www.bookswagon.com/";
			Assert.assertEquals(Actualurl,Expectedurl);
			
//	       assertion to check Title		
			String actualtitle = driver.getTitle();
			String expectedtitle = "Online Bookstore | Buy Books Online | Read Books Online";
			Assert.assertEquals(actualtitle,expectedtitle);
		
		 
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize();
		 Screenshot.capture(2);
		 
	}	
		 
		  

	        
		 
		
		@AfterClass
	    public void End () {
		driver.quit();
	}
}
