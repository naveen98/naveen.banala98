package assinments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class google {

	public static void main(String[] args) throws IOException {
WebDriver driver = new ChromeDriver();
driver.get("https://google.com");
TakesScreenshot ts= (TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\navee\\OneDrive\\Desktop\\screenshots\\googlepage.jpg");
Files.copy(src, dest);
	}

}
