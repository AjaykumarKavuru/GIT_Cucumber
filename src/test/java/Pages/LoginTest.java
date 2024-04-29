package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	WebDriver driver;

	By txt_username = By.name("username");
	By txt_password = By.name("password");
	By btn_login = By.xpath("//button[@type='submit']");
	By txt_Dashboard = By.xpath("//h6[text()='Dashboard']");
	
	public LoginTest(WebDriver driver) {
		this.driver = driver;
	}
	
	public void EnterloginDetails(String username, String pwd) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(pwd);
	}
	
	public void ClickLogin() {
		driver.findElement(btn_login).click();
	}
	public void HomePageVal() {
		driver.findElement(txt_Dashboard).isDisplayed();
	}
}
