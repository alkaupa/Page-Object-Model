package checkingModules;


import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Screenshot;
import page2.Addcart;
import page2.BestSeller;
import page2.ClickBook;
import page2.RemoveBooks;
import page3.ArtOfwar;
import page3.BuyBook;
import page3.FeaturedAuthor;
import page3.QAG;
import page3.StephenCoonts;
import pages.AddToCart;
import pages.BuY;
import pages.NewArrivalPage;
import pages.SelectAndClickBook;

 public class ClickTest  extends BaseTest { // this is my child class 
   
   NewArrivalPage np;
   Properties pr;
   SelectAndClickBook scb;
   AddToCart atc;
   BuY buy;
   BestSeller bs;
   ClickBook cb;
   Addcart ac;
   RemoveBooks rb;
   FeaturedAuthor fa;
   StephenCoonts sc;
   ArtOfwar aw;
   QAG qa;
   BuyBook bb;
   
   
		
   
   @Test(priority = 1)
   public void click1() throws InterruptedException, IOException {
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   
	   
	   pr = new Properties();
	  
	   np = new NewArrivalPage(driver);
	   
	   np.getNewArrival().click();
	   Screenshot.capture(3);
	   
	   
	   
	   Thread.sleep(2000);
	   
	 }
   


   @Test(priority = 2)
   public void click2() throws InterruptedException, IOException {
	   
	   pr = new Properties();
	   
	   scb = new SelectAndClickBook(driver);
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Paper Back ']")));
	   
	   scb.getCheckbox().click();
	   Screenshot.capture(4);
	   
	 
	   
	   Thread.sleep(2000);
	   
	   scb.getLanguagecheckbox().click();

	   Thread.sleep(2000);
	   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='House of Flame and Shadow']")));
	   
	   scb.getClickbook().click();
	   Screenshot.capture(5);
	   
	   Thread.sleep(2000);
	   
	   
	 }
   
   @Test(priority = 3)
   public void click3() throws InterruptedException, IOException {
	   
	   pr = new Properties();
	   
	   atc = new AddToCart(driver);
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='btnAddtocart']")));
	   
	   
	   atc.getAddToCart().click();
	   Screenshot.capture(6);
	   
	   
	   Thread.sleep(2000);
	   
	   

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='btnGotocart']")));
	   
	   atc.getGoToCart().click();
	   
	   Thread.sleep(2000);
	   
   }
   
   @Test(priority = 4)
   public void click4() throws InterruptedException, IOException {
	   
	   pr = new Properties();
	   
	   buy = new BuY(driver);
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Buy']")));
	   
	   
	   buy.getBuy().click();
	   Screenshot.capture(7);
	   
	  
	   Thread.sleep(2000);
   }
   
   @Test(priority = 5)
   public void click5() throws InterruptedException, IOException {
	   
	   pr = new Properties(); 
	   
	   bs = new BestSeller(driver);
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Best sellers'])[1]")));
	   
	   
	   bs.getBestseller().click();
	   Screenshot.capture(8);

	   
	   Thread.sleep(2000);
	   
   }
   @Test(priority = 6)
   public void click6() throws InterruptedException, IOException {
	   
	   pr = new Properties(); 
	   
	   cb = new ClickBook(driver);
	   
	   cb.getPaperbackcheckbox().click();
	   Screenshot.capture(9);
	   
	   Thread.sleep(2000);
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Tamil ']")));
	   
	   
	   cb.getTamillanguage().click();
	   Screenshot.capture(10);
	   
	   Thread.sleep(2000);
	   
	   cb.getThemagic().click();
	   
	   Thread.sleep(2000);
   }
   
   @Test(priority = 7)
   public void click7() throws InterruptedException, IOException {
	   
	   pr = new Properties();
	   
	   ac = new Addcart(driver);
	   
	   ac.getAddtocart().click();
	   
	   Thread.sleep(2000);
	   
	   ac.getGotocart().click();
	   Screenshot.capture(11);
	  
	   Thread.sleep(2000);
	   
   }
   
   @Test(priority = 8)
   public void click8() throws InterruptedException, IOException {
	   
	   pr = new Properties(); 
	   
	   rb = new RemoveBooks(driver);
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl00_phBody_BookCart_lvCart_ctrl0_imgDelete']")));
	   
	   rb.getRemovebook1().click();
	  
	   Thread.sleep(2000);

       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Remove']")));
	   
	   rb.getRemovebook2().click();
	   
	   Thread.sleep(2000);
	   
  }
   
   @Test(priority = 9)
   public void click9() throws InterruptedException, IOException {
	   
	   pr = new Properties();
	   
	  fa = new FeaturedAuthor(driver);
	   
	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Featured Authors'])[1]"))); 
	   
	   fa.getFeatureauthor().click();
	  
	   Thread.sleep(2000);
	   
	 }
   
  @Test(priority = 10)
  public void selectauthor() throws InterruptedException, IOException {
	  
	  pr = new Properties();
	  
	  sc = new StephenCoonts(driver);
	  
	  sc.getAuthor().click();
	  
	  Thread.sleep(2000);
	  
	}
  
  @Test(priority = 11)
  public void bookselect() throws InterruptedException, IOException {
	  
	  pr = new Properties();
	  
	  aw = new ArtOfwar(driver);
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("The Art Of War"))); 
      
      wait.until(ExpectedConditions.elementToBeClickable(By.linkText("The Art Of War")));
      
	  aw.getArtofwarbook().click();
	  Screenshot.capture(12);

	  
	  Thread.sleep(2000);
	  
	}
  
  @Test(priority = 12)
  public void qag () throws InterruptedException, IOException{
	  
	  pr = new Properties();
	  
	  qa = new QAG(driver);
	  
	  qa.getQuantityclick().click();
	  
	  Thread.sleep(2000);
	  
	  qa.getNumber().click();
	  
	  Thread.sleep(2000);
	  
	  qa.getAddtocart().click();
	 
	  Thread.sleep(2000);
	  
	  qa.getGotocart().click();
	  
	  Thread.sleep(2000);
	}
  
  @Test(priority = 13)
  public void buy() throws InterruptedException, IOException {
	  
	  pr = new Properties();
	  
	  bb = new BuyBook(driver);
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Buy']")));   
	  
	  bb.getBuy().click();
	  Screenshot.capture(13);
	  
	  Thread.sleep(2000);
	  
  }
   
   
   
   
   
	
}


