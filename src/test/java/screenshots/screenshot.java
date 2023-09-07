package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();

		// random screenshots

		Random r = new Random();

		int rc = r.nextInt(10);

		driver.get("https://www.google.com");

		// convert the control of selenium

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("C:\\Users\\navee\\OneDrive\\Desktop\\screenshots\\Googlepage.png" + rc + "");

		Files.copy(src, dest);

	}

}
