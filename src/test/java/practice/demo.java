package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Point p = new Point(500, 300);
		driver.manage().window().setPosition(p);
		driver.findElement(By.linkText("Gmail")).click();
	    driver.findElement(By.partialLinkText("Gm")).click();
		driver.findElement(By.linkText("Images")).click();
	}

}
