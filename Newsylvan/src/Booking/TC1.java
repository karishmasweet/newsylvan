package Booking;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC1 extends baseclassone
{
	@Test
	public void bookingflow() throws InterruptedException, AWTException
	{
		WebElement Signin=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink3']"));
		Signin.click();
		
		Thread.sleep(5000);
		WebElement parentlogin=driver.findElement(By.xpath("(//a[text()='I’m a  Parent'])[1]"));
		parentlogin.click();
		
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		username.sendKeys("raman452");
		
		Thread.sleep(5000);
		WebElement passwordparent=driver.findElement(By.xpath("//input[@name='pasword']"));
		passwordparent.sendKeys("Qwerty@123");
		
		Thread.sleep(5000);
		WebElement signclick=driver.findElement(By.xpath("//button[@id='btnsubmit']"));
		signclick.click();
		
		Thread.sleep(5000);
		WebElement viewdetail=driver.findElement(By.xpath("(//button[@class=' view-detail'])[1]"));
		viewdetail.click();
		
		
		
	}

}
