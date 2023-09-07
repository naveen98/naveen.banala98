package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class notificationpopup {

	public static void main(String[] args) {
	System.setProperty("webdriver.firefox", "C:\\Program Files\\Mozilla Firefox.exe");
	
FirefoxOptions c= new FirefoxOptions();
  WebDriver driver= new FirefoxDriver(c);
  driver.get("https://www.hdfc.com");
  c.addArguments("--disable-notifications");
  c.addArguments("start-maximized");

		
		
		
		
		
	}

}
