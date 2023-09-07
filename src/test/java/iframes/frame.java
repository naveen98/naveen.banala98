package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		// navigate to 1st frame
		driver.switchTo().frame(0);
		// search any element store in ref var and print it
		String data = driver.findElement(By.xpath("(//a['text()=org.openqa.selenium.bidi.browsingcontext'])[4]"))
				.getText();
		System.out.println(data);

		// move cursor to main webpage element on 2nd frame
		driver.switchTo().defaultContent();

		// navigate to 2nd frame
		driver.switchTo().frame(1);

		// search any element and print
		String data1 = driver.findElement(By.xpath("//a[text()='AbstractHttpCommandCodec.CommandSpec']")).getText();
		System.out.println(data1);

		// move cousor on main webpage to element 0n 3rd frame
		driver.switchTo().defaultContent();
		// navigate to 3rd frame
		driver.switchTo().frame(2);

		String data2 = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium.bidi.browsingcontext'])[1]"))
				.getText();
		System.out.println(data2);

	}

}
