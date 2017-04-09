package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageClass.ClickRegister;
import PageClass.FlightReservation;
import PageClass.RegistrationPage;
import PageClass.SignOn;
import Utilities.FileReadProperties;
import Utilities.FileWriteProperties;

public class TestPriority {
	ClickRegister clickregister;
	RegistrationPage registrationpage;
	FileWriteProperties fwriteproperty;
	SignOn signon;
	FileReadProperties filereadproperties;
	FlightReservation flightreservation;
	
	WebDriver driver;

	@BeforeTest
	public void launchURL()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@Test(priority = 0)
	public void clickRegisterLink()
	{
		clickregister = new ClickRegister(driver);
		clickregister.clickRegisterLink();	
	}

	@Test(priority = 1)
	public void fillRegistration()
	{
		registrationpage = new RegistrationPage(driver);
		fwriteproperty = new FileWriteProperties();
		fwriteproperty.filewrite("Bajrang", "Goyal","Bajrang12","12345");
		registrationpage.enterFirstName("Bajrang");
		registrationpage.enterLastName("Goyal");
		registrationpage.enterUserName("lokenath12");
		registrationpage.enterPassword("123456");
		registrationpage.enterConfirmPassword("123456");
		registrationpage.clickSubmit();
	}

	@Test(priority = 2)

	public void clickSignOnLink()
	{
		registrationpage.clickSignOn();
	}

	@Test(priority = 3)

	public void enterSignOnDetails()
	{
		signon = new SignOn(driver);
		//signon.enterUserName(");
		filereadproperties=new FileReadProperties();
		signon.enterUserName(filereadproperties.getValue("UserName"));
		signon.enterPassword(filereadproperties.getValue("password"));
		signon.clickSubmit();
	}

	@Test(priority = 4)

	public void selectTripType()
	{
		flightreservation = new FlightReservation(driver);
		flightreservation.setTriptype();
		//driver.findElement(By.cssSelector("input[value='oneway']")).click();
	}
	
	@Test(priority = 5)

	public void selectPassengers()
	{
		flightreservation.selectPassengers();
		
	}
	
	@Test(priority = 6)

	public void selectServiceClass()
	{
		flightreservation.selectServiceClass();
		
	}
	
	@Test(priority = 7)

	public void selectFromMonth()
	{
		flightreservation.selectFromMonth();
		
	}





}
