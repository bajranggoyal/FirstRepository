package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOn {
	
	WebDriver driver;

	By username = By.name("userName");
	By password = By.name("password");
	By submit = By.name("login");
	

	public SignOn(WebDriver driver)
	{
		this.driver = driver;
	}

	public void enterUserName(String uName)
	{
		driver.findElement(username).sendKeys(uName);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		driver.findElement(submit).click();
	}
	
	

}
