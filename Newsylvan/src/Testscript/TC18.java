package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC18 extends baseclassone
{
	@Test
	public void forgotpassword_tutor_invalidemailformat() throws InterruptedException
	{
		String expected="Please enter a valid email address.";
		
		WebElement password=driver.findElement(By.xpath("//a[contains(text(),'Password')]"));
		password.click();
		
		Thread.sleep(5000);
		WebElement emailaddress=driver.findElement(By.xpath("//input[@placeholder='Enter your email address.']"));
		emailaddress.sendKeys("may@yopmail.");
		
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.xpath("//span[contains(text(),'Are you a parent or tutor?')]"));
		dropdown.click();
		
		Thread.sleep(5000);
		WebElement tutor=driver.findElement(By.xpath("//md-option[@value='tutor']"));
		tutor.click();
		
		Thread.sleep(5000);
		WebElement tutorsubmit=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		tutorsubmit.click();
		
		Thread.sleep(5000);
		String pop=driver.findElement(By.xpath("//div[contains(text(),'Please enter a valid email address.')]")).getText();
		System.out.println(pop);
		
		Assertions2.assert1(expected,pop);
		
		}
	

}
