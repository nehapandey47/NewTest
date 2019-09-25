package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestmeApplogin {

	WebDriver driver=null;
	@Given("^the login page is opened$")
	public void the_login_page_is_opened()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\Browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		
	}

	@When("^user enters lalitha as username$")
	public void user_enters_lalitha_as_username(String username)  {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("^the user enters password(\\d+) as password$")
	public void the_user_enters_password_as_password(String password)  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Then("^user will find a testmeapp homepage$")
	public void user_will_find_a_testmeapp_homepage()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
		System.out.println("title of the page is"+driver.getTitle());
	}

	
	
}
