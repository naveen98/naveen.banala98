package assinments;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollactitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();		
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollby(0,2000);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollby(0,-2000);");
	}

}
