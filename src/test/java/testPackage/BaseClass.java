package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import testUtility.Staticbrowser;

public class BaseClass {
	static WebDriver driver;
	 @Parameters({"browser"})
	 
	 @BeforeTest
	 public void beforeTest(String browser)
	 {
	 driver=Staticbrowser.openBrowser(browser,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 this.driver=driver;
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }

	 @AfterTest
	 public void afterTest()
	 {
	
	 }
}
