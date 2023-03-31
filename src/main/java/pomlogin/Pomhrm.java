package pomlogin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Pomhrm {
	 WebDriver driver;
	 WebDriverWait wait;
	 @FindBy(xpath="//input[@name='username']")
	 private WebElement username;
	
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement password;
	
	 @FindBy(xpath="//button[text()=' Login ']")
	 private WebElement login;
	
	 public Pomhrm(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 this.driver=driver;
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 }
	
	 public void verifyForUsername(String Username)
	 { 
	 	username.sendKeys(Username);
	 }
	
	 public void verifyForPassword(String Password)
	 {
		 password.sendKeys(Password);
	 }
	
	 public void verifyForLogin()
	 {
	 login.click();

}
}
