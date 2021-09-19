package Booking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC2 extends baseclassone

{
	@Test
	public void bookingflow_singlesession() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
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
		WebElement view_profile=driver.findElement(By.xpath("//button[contains(text(),'View Profile')][1]"));
		view_profile.click();
		
		Thread.sleep(5000);
		WebElement booksession=driver.findElement(By.xpath("//Button[contains(text(),'Book a Session ')]"));
		booksession.click();
		
		Thread.sleep(5000);
		WebElement student=driver.findElement(By.xpath("//mat-chip[@class='mat-chip mat-primary'][2]"));
		student.click();
		
		Thread.sleep(5000);
		WebElement child=driver.findElement(By.xpath("//span[text()='Online']"));
		child.click();
		
		Thread.sleep(5000);
		WebElement addsubject=driver.findElement(By.xpath("//a[@class='mr-4 addMore']/span"));
		addsubject.click();
		
		Thread.sleep(5000);
		WebElement java=driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[5]"));
		java.click();
		Thread.sleep(5000);
		WebElement save_button=driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		save_button.click();
		
		Thread.sleep(5000);
		WebElement next=driver.findElement(By.xpath("//button[@class='common-btn pointer ']"));
		next.click();
		
		Thread.sleep(5000);
		WebElement schedule_button=driver.findElement(By.xpath("//button[contains(text(),'Schedule Session')]"));
		schedule_button.click();
		
		
		
    
	}

}
