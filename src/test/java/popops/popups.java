package popops;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.get("https://demo.guru99.com/test/delete_customer.php");
    //write customer id
    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
    // click on submit 
    driver.findElement(By.xpath("//input[@type='submit']")).click();   
    
    //cursor from main page to web page
    Alert alt= driver.switchTo().alert();
   alt.accept();
   // alt.dismiss();
    String text= driver.switchTo().alert().getText();
   // System.out.println(text);
    
	}
 
}
