//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageFactory.HomePage;
//import PageFactory.Login;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class PageFactory {
//
//	public WebDriver driver;
//	Login login;
//	HomePage homepage;
//	
//	@Given("User is on Login Page")
//	public void user_is_on_login_page() {
//	    driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	    driver.manage().deleteAllCookies();
//	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
////	@When("User Enters username and Password")
////	public void user_enters_username_and_password() {
//	@When("User Enters {string} and {string}")
//	public void user_enters_and(String username, String password) {
//	    login = new Login(driver);
//	    login.EnterLoginDetails(username, password);
//	}
//
//	@And("Click on Login Button")
//	public void click_on_login_button() {
//		login.ClickOnLogin();
//	}
//
//	@Then("User navigates to HomePage")
//	public void user_navigates_to_home_page() {
//		homepage = new HomePage(driver);
//	    homepage.txtvalidation();
//	}
//
//	@And("Close the browser")
//	public void close_the_browser() {
//	    driver.close();
//	}
//
//}
