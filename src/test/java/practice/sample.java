package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("naveen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("banala");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("banalanaveen.9@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("banalanaveen.9@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123456n");

		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select d = new Select(day);
		d.selectByVisibleText("1");

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Jan");

		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(year);
		y.selectByVisibleText("1998");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		
		
		
		
		
		
	}

}
