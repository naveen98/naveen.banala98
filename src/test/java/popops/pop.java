package popops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pop {

	

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver =new FirefoxDriver();
		    driver.get("https://www.google.in");
		    driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("baby movie");
		    Thread.sleep(2000);
		   driver.findElement(ByXPath.xpath("(//input[@class='gNO89b'])[1]")).click();
		   Thread.sleep(3000);
		  driver.findElement(By.linkText("Reviews")).click();
		  List<WebElement>el=driver.findElements(By.linkText("Audience reviews"));
		  List<WebElement> ele= driver.findElements(By.xpath("(//div[@aria-level='2'])[1]"));
		  for(WebElement i:ele)
		  {
			 String str =i.getText();
			 
			 System.out.println(str);
			
		
			  
		  }
		  for(WebElement e:el)
		  {
		  String str1=e.getText();
		  System.out.println(str1);
		  }
		  
	
		    
	}

}
