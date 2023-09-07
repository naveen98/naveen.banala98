package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();	
		driver.navigate().to("https://www.amazon.in");
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000);");//scroll down
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-2000);");//scroll up

	}

}
