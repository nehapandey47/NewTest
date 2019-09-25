package pom_withpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class page_witfac_class {
  WebDriver driver;
  @FindBy(how=How.LINK_TEXT,using="Log in")WebElement Login;
  @FindBy(how=How.ID,using="Email")WebElement username;
  @FindBy(how=How.NAME,using="Password")WebElement password;
  @FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")WebElement log;
  
public page_witfac_class(WebDriver driver)
    {
	this.driver=driver;
	}
public void LoginMethod(String uid,String pwd)
    {
	 Login.click();
	 username.sendKeys(uid);
	 password.sendKeys(pwd);
	 log.click();
	}

}
