package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityt {
	@Test(priority = 3)
	public void m1() 
	{
		Reporter.log("had you done your Dinner",true);

	}
	@Test(priority = 1)
	public void m2()
	{
		Reporter.log("had you done your breakfast",true);
	}
	@Test(priority = 2)
	public void m3()
	{
		Reporter.log("had you done lunch",true);
	}
	
	}



