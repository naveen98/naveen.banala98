package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class singlemethod {
	@Test
	public void show() {
		Reporter.log("hi iam using single method",true);
		
		
	}

}
