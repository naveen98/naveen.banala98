package pom_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebook_loginpage {
	//declaration
	@FindBy(xpath = "//input[@id='username']")private WebElement untextbox;
	@FindBy(xpath = "//input[@type='password']")private WebElement pwdtextbox;
	@FindBy(xpath = "//div[text()='Login ')")private WebElement loginbtn;

	
	//intialization

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
