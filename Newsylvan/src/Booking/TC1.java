package Booking;

import java.awt.AWTException;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC1 extends baseclassone
{
	@Test
	public void bookingflow() throws InterruptedException, AWTException
	{
		//String expected="Oops! It doesn’t look like we have tutors that meet the criteria you entered. Try adjusting your preferences to increase your chances for a match! Or, you can call the Sylvan In-Home team at (888) 997-0145 if you would like assistance finding a tutor near you.";
		
		Thread.sleep(10000);
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
		
		int x=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all ui-clickable'])[1]")).getLocation().getX();
		System.out.println(x);
	
	    int y=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all ui-clickable'])[1]")).getLocation().getY();
	    System.out.println(y);
		
	    WebDriverWait wait=new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all ui-clickable'])[1]")));
	    WebElement dragbutton=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-state-default ui-corner-all ui-clickable'])[1]"));
	    int xwidth=dragbutton.getSize().getWidth();
	    
	    
		Actions obj=new Actions(driver);
		obj.dragAndDropBy(dragbutton,xwidth*3,0).build().perform();
		Thread.sleep(5000);
		
		
//		Thread.sleep(20000);
//		String newpop=driver.findElement(By.xpath("//label[contains(text(),'Oops')]")).getText();
//		System.out.println(newpop);
//		
//		Assertions2.assert1(expected,newpop);
		
	}

}
