package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class actitime {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();		
		driver.get("https://demo.actitime.com/login.do");
		
		// Username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		//password
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//login
		driver.findElement(By.xpath("//div[text()='Login ')")).click();
	
	
	
	}

	

}
