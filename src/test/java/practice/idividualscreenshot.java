package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class idividualscreenshot {

	public static void main(String[] args) throws IOException 
	
	{
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://www.google.com");
		
		//individual elements of screenshot
		
		WebElement ind =driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		
		File src=ind.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\navee\\OneDrive\\Desktop\\screenshots\\Googlelogo.png");
		
		Files.copy(src, dest);


	}

}
