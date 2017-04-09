package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	WebDriver driver;

	By firstname = By.name("firstName");
	By lastname=By.name("lastName");
	By username=By.name("email");
	By pwd = By.name("password");
	By cnfmpwd = By.name("confirmPassword");
	By submit = By.name("register");
	By signon = By.linkText("sign-in");


	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void enterFirstName(String fname)

	{
		driver.findElement(firstname).sendKeys(fname);
	}

	public void enterLastName(String lname)

	{
		driver.findElement(lastname).sendKeys(lname);
	}

	public void enterUserName(String uname)

	{
		driver.findElement(username).sendKeys(uname);
	}

	public void enterPassword(String password)

	{
		driver.findElement(pwd).sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword)

	{
		driver.findElement(cnfmpwd).sendKeys(confirmPassword);
	}

	public void clickSubmit()

	{
		driver.findElement(submit).click();
	}

	public void clickSignOn()
	{
		driver.findElement(signon).click();
	}


}
