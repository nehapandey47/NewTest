package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcasePageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6b.01.16\\Desktop\\Browser_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Pageclass obj=new Pageclass(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		obj.clicklink();
		String username=null;
		obj.typename();
		String password=null;
		obj.typepassword(password);
		obj.clickonlogin();
		obj.clickonlogOUT();
		System.out.println("title of page is "+driver.getTitle());
		

	}

}
