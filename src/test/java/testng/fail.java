package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class fail {
	// it will fail test case
	@Test
	public void m1() {
		Reporter.log("had you done your Dinner", true);
		Assert.fail();
	}

	@Test
	public void m2() {
		Reporter.log("had you done your breakfast", true);
	}

	@Test
	public void m3() {
		Reporter.log("had you done lunch", true);
	}
}
