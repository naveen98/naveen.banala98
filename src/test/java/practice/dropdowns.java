package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		// open facebook

		driver.get("https://facebook.com");
		Thread.sleep(2000);

		// create new account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);

		// select day
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		Select d = new Select(day);
		d.selectByVisibleText("1");

		// select month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(1000);
		Select m = new Select(month);
		m.selectByVisibleText("Jan");
		Thread.sleep(2000);
		
		// select year
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(1000);
		// create object of select class
		Select s = new Select(year);
		s.selectByVisibleText("1988");

	}

}
