package pom_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebook_createaccountpage {
	
	//declaration
	@FindBy(xpath = "//input[@id='u_2_b_7b']")private WebElement firstnametextbox;
	@FindBy(xpath = "//input[@id='u_2_d_G/']")private WebElement surnametextbox;
	@FindBy(xpath = "//input[@id='u_2_g_q5']")private WebElement emailidtextbox;
	@FindBy(xpath = "//input[@id='password_step_input']")private WebElement pwdtextbox;
	//intialization
	public WebElement getFirstnametextbox() {
		return firstnametextbox;
	}
	public WebElement getSurnametextbox() {
		return surnametextbox;
	}
	public WebElement getEmailidtextbox() {
		return emailidtextbox;
	}
	public WebElement getPwdtextbox() {
		return pwdtextbox;
	}
	
	

}
