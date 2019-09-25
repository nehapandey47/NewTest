package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class parameterization {
	WebDriver driver=null;
	@Given("^user has opened the application$")
	public void user_has_opened_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\Browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
	}

	@When("^user click onto the signin link$")
	public void user_click_onto_the_signin_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^use enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void use_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
	}

	@Then("^message display login successful$")
	public void message_display_login_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
		System.out.println("title of the page is"+driver.getTitle());
	}
}
