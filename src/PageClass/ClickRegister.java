package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickRegister {
	WebDriver driver;

	public ClickRegister(WebDriver driver)
	{
		this.driver = driver;
	}

	By RegisterLink = By.linkText("REGISTER");

	public void clickRegisterLink()
	{
		driver.findElement(RegisterLink).click();
	}
}
