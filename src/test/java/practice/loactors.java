package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loactors {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles under 20000");

		// xpath

		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ')")).click();
		// driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
		// driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		// driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		// driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		// driver.findElement(By.xpath("(//div)[13]")).click();

	}

}
