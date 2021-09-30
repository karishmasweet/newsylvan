package Booking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import Base.baseclassone;
import util.locators;
import util.Commonfunction;
public class TC2 extends baseclassone

{
	@FindBy(xpath=locators.username)
	WebElement username;
	@FindBy(xpath=locators.passwordparent)
	WebElement passwordparent;
	
	
	@Test
	public void bookingflow_singlesession() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,90);
		Thread.sleep(15000);

	    Commonfunction.Wait(driver,username);
		username.sendKeys("raman452");

		Commonfunction.Wait(driver,passwordparent);
		passwordparent.sendKeys("Qwerty@123");
			
		
    
	}

	

	
		
	

}
