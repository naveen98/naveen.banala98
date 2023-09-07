package practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leftclick {

	public static void main(String[] args) throws InterruptedException {
   WebDriver driver = new ChromeDriver();
     driver.get("https://www.flipkart.com");
     Thread.sleep(2000);
      WebElement lef=driver.findElement(By.xpath("(//div[@class='_3ETuFY'])[1]"));
      Actions act=new Actions(driver);
      act.moveToElement(lef).click().perform();
	}

}
