package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	@FindBy(name = "username")
	WebElement txt_username;
	
	@FindBy(name = "password")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement btn_login;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EnterLoginDetails(String Username, String Password) {
		txt_username.sendKeys(Username);
		txt_password.sendKeys(Password);
	}
	
	public void ClickOnLogin() {
		btn_login.click();
	}

}
