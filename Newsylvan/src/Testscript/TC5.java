package Testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC5 extends baseclassone
{
	@Test
	public void forgotusername_parent() throws InterruptedException
	{
		WebElement username=driver.findElement(By.xpath("//a[contains(text(),'Username')]"));
		username.click();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);
		WebElement emailaddress=driver.findElement(By.xpath("//input[@placeholder='Enter your email address.']"));
		emailaddress.sendKeys("test120012@yopmail.com");
		
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
		WebElement ok=driver.findElement(By.xpath("(//button[@class='pinkButton'])[3]"));
		ok.click();
		
		
		
		
	}

}
