package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation {
@Test(invocationCount = 10)
public void m1() 
{
	Reporter.log("had you done your Dinner",true);

}
}
