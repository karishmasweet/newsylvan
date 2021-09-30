package Booking;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC3 extends baseclassone
{
	@Test
	public void bookingflow_mutisession() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
	    WebElement username=driver.findElement(By.xpath(pr.getProperty("username")));
		username.sendKeys("raman452");
		
		Thread.sleep(5000);
		WebElement passwordparent=driver.findElement(By.xpath(pr.getProperty("passwordparent")));
		passwordparent.sendKeys("Qwerty@123");
		
		Thread.sleep(5000);
		WebElement signclick=driver.findElement(By.xpath(pr.getProperty("signclick")));
		signclick.click();
		
		WebDriverWait w=new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'View Profile')][1]")));
		WebElement view_profile=driver.findElement(By.xpath(pr.getProperty("view_profile")));
		view_profile.click();
		
		Thread.sleep(5000);
		WebElement booksession=driver.findElement(By.xpath(pr.getProperty("booksession")));
		booksession.click();
		
		Thread.sleep(5000);
		WebElement student=driver.findElement(By.xpath(pr.getProperty("student")));
		student.click();
		
		Thread.sleep(5000);
		WebElement child=driver.findElement(By.xpath(pr.getProperty("child")));
		child.click();
		
		Thread.sleep(5000);
		WebElement addsubject=driver.findElement(By.xpath(pr.getProperty("addsubject")));
		addsubject.click();
		
		Thread.sleep(5000);
		WebElement java=driver.findElement(By.xpath(pr.getProperty("java")));
		java.click();
		
		Thread.sleep(5000);
		WebElement save_button=driver.findElement(By.xpath(pr.getProperty("save_button")));
		save_button.click();
		
		Thread.sleep(5000);
		WebElement next=driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		
		Thread.sleep(5000);
		WebElement schedule_button=driver.findElement(By.xpath(pr.getProperty("schedule_button")));
		schedule_button.click();
		
		
		
	}

}
