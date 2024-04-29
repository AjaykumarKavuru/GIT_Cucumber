package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroung {
	
	public WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().deleteAllCookies();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

//	@When("User Enters username and Password")
//	public void user_enters_username_and_password() {
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String username, String password) throws InterruptedException {
//		Thread.sleep(2000);
//	    driver.findElement(By.name("username")).sendKeys(username);
//	    driver.findElement(By.name("password")).sendKeys(password);
//	}
	
	@When("User Enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User navigates to HomePage")
	public void user_navigates_to_home_page() {
	    WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
	    String status = dashboard.getText();
	    Assert.assertEquals(status, "Dashboard","Unable to navigate to homePage");
	}

	@And("Close the browser")
	public void close_the_browser() {
//	    driver.close();
	    driver.quit();
	}

}
