package generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	private static WebDriver driver;
	public static void setDriver(WebDriver driverInstance) {
        driver = driverInstance;
    }
	public static void capture(int number) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\alkau\\Pictures\\Screenshots\\screenshot" + number + ".png");
        FileUtils.copyFile(sourceFile, destinationFile);
    }
}
	


