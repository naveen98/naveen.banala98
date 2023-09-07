package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		     driver.get("https://www.flipkart.com");
		   
		     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    WebElement dobclick = driver.findElement(By.linkText("Become a Seller"));
		     Actions act =new Actions(driver);
		     act.moveToElement(dobclick).doubleClick().build().perform();
	}

}
