package assinments;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollgoogle {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://google.com");
JavascriptExecutor jse= (JavascriptExecutor)driver;
jse.executeScript("window.scroolby(0,2000);");
Thread.sleep(2000);
jse.executeScript("window.scroolby(0,-2000);");
	}
}
