package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.UselessFileDetector;

public class rightclick {

	public static void main(String[] args) {
		   WebDriver driver =new ChromeDriver();
		   driver.get("https://www.google.com");
		   WebElement ele=driver.findElement(By.xpath("(//a[@class='gb_y'])[1]"));
		   
		  Actions act=new Actions(driver);
		  act.contextClick(ele).perform();
		   
		   
		   
	}

}
