package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//declaration
	@FindBy(xpath = "//input[@id='username']")private WebElement untextbox;
	@FindBy(xpath = "//input[@type='password']")private WebElement pwdtextbox;
	@FindBy(xpath = "//div[text()='Login ')")private WebElement loginbtn;
//intialization
	public loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		

	}
	//implementation
	public WebElement getUntextbox() {
		return untextbox;
	}
	public WebElement getPwdtextbox() {
		return pwdtextbox;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

}
