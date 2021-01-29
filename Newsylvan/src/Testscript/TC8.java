package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC8 extends baseclassone
{
	@Test
	public void forgotpassword_tutor() throws InterruptedException
	{
		WebElement password=driver.findElement(By.xpath("//a[contains(text(),'Password')]"));
		password.click();
		
		Thread.sleep(5000);
		WebElement emailaddress=driver.findElement(By.xpath("//input[@placeholder='Enter your email address.']"));
		emailaddress.sendKeys("mayank101@yopmail.com");
		
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
		WebElement ok=driver.findElement(By.xpath("(//button[@class='pinkButton'])[3]"));
		ok.click();
		}
	

}
