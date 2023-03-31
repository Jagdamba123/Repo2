package testUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Staticbrowser {
	 static WebDriver driver;
	 public static WebDriver openBrowser(String browser, String URL)
	 {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
	 WebDriverManager.chromedriver().setup();
	 ChromeOptions opt=new ChromeOptions();
	 opt.addArguments("--remote-allow-origin=*");
	 driver=new ChromeDriver(opt);
	 }
	 else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	
	 else if(browser.equalsIgnoreCase("edge"))
	 {
	 WebDriverManager.edgedriver().setup();
	 driver= new EdgeDriver();
	 }
	 driver.get(URL);
	 driver.manage().window().maximize();
	 return driver;
	 }

}
