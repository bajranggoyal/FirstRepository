package PageClass;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Utilities.FileReadProperties;

public class FlightReservation {

	WebDriver driver;
//	FileReadProperties fileread;
	FileReadProperties fileread= new FileReadProperties();
	
	
	//by triprt
	//By tripname = By.name(fileread.getValue("tripname",new File("C:\\Users\\USER\\workspace\\myFirstProject\\src\\PageUILocatorProperties\\FlightReservation.properties")));
	By tripname = By.cssSelector("input[value='"+fileread.getValue("tripname",new File("C:\\Users\\USER\\workspace\\myFirstProject\\src\\PageUILocatorProperties\\FlightReservation.properties"))+"']");
	By serviceclass = By.cssSelector("input[value='"+fileread.getValue("serviceclass",new File("C:\\Users\\USER\\workspace\\myFirstProject\\src\\PageUILocatorProperties\\FlightReservation.properties"))+"']");
	//By selectfrommonth = By.cssSelector("input[value='"+fileread.getValue("selectfrommonth",new File("C:\\Users\\USER\\workspace\\myFirstProject\\src\\PageUILocatorProperties\\FlightReservation.properties"))+"']");

	public FlightReservation(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public void setTriptype()
	{
		driver.findElement(tripname).click();
	}
	
	public void selectPassengers()
	
	{
		
		Select passengerselect= new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")));
		passengerselect.selectByVisibleText(fileread.getValue("noofpassengers",new File("C:\\Users\\USER\\workspace\\myFirstProject\\src\\PageUILocatorProperties\\FlightReservation.properties"))); 
		
	}
	
	public void selectServiceClass()
	{
		driver.findElement(serviceclass).click();
		
	}	
	
	public void selectFromMonth()
	{
		Select frommonth = new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[5]/td[2]/select[1]")));
		frommonth.selectByVisibleText(fileread.getValue("selectfrommonth", new File("C:\\Users\\USER\\workspace\\myFirstProject\\src\\PageUILocatorProperties\\FlightReservation.properties")));
	}
	
	
	
}
