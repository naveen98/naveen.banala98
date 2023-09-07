package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ankush {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in");

	//	driver.manage().window().maximize();
		//Thread.sleep(2000);
	//	String a = driver.getTitle();
		//System.out.println(a);
	//	driver.navigate().to("https://www.flipkart.com");
		//Thread.sleep(4000);
		//driver.navigate().back();
		Thread.sleep(3000);
	//	driver.navigate().forward();
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		driver.navigate().refresh();
		text.sendKeys("mobiles under20000");
		
	//	driver.close();
	//	driver.quit();

	}

}
