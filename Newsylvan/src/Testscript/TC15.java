package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC15 extends baseclassone
{
	@Test
	public void forgotusernameparent_notregisteredemail() throws InterruptedException
	{
		String expected="User not found. Please check your email address and try again.";
		
		WebElement username=driver.findElement(By.xpath("//a[contains(text(),'Username')]"));
		username.click();
		
		Thread.sleep(5000);
		WebElement emailaddress=driver.findElement(By.xpath("//input[@placeholder='Enter your email address.']"));
		emailaddress.sendKeys("mayank101@yopmail.com");
		
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.xpath("//span[contains(text(),'Are you a parent or tutor?')]"));
		dropdown.click();
		
		Thread.sleep(5000);
		WebElement parent=driver.findElement(By.xpath("//md-option[@value='parent']"));
		parent.click();
		
		Thread.sleep(5000);
		WebElement parentsubmit=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		parentsubmit.click();
		
		Thread.sleep(5000);
		String pop=driver.findElement(By.xpath("//p[contains(text(),'User not fou')]")).getText();
		System.out.println(pop);
		
		Assertions2.assert1(expected,pop);
	}


}
