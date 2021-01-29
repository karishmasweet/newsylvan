package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC3 extends baseclassone
{
	@Test
	 
	 public void signup_tutor() throws InterruptedException
	 {
	 WebElement Signup=driver.findElement(By.xpath("//button[@id='navbarDropdownMenuLink4']"));
		Signup.click();
		
		Thread.sleep(5000);
		WebElement Tutor=driver.findElement(By.xpath("(//a[text()='I’m a  Tutor'])[2]"));
		Tutor.click();
		
		Thread.sleep(5000);
		WebElement fname=driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("Rameshtest");
		
		Thread.sleep(5000);
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("testverma");
		
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("tutor120065@yopmail.com");
		
		Thread.sleep(5000);
		WebElement confirmemail=driver.findElement(By.xpath("//input[@placeholder='Confirm Email Address']"));
		confirmemail.sendKeys("tutor120065@yopmail.com");
		
		Thread.sleep(5000);
		WebElement mobile=driver.findElement(By.xpath("//input[@placeholder='Mobile Phone Number']"));
		mobile.sendKeys("7185060911");
		
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
		username.sendKeys("tutor120065");
		
		Thread.sleep(5000);
		WebElement Password=driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
		Password.sendKeys("Qwerty@123");
		
		
		Thread.sleep(5000);
	    WebElement create=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		create.click();		
		
		Thread.sleep(5000);
	    WebElement otp=driver.findElement(By.xpath("//input[@ng-reflect-klass='verifyOtp']"));
		otp.sendKeys("0000");
		
		Thread.sleep(5000);
	    WebElement verify=driver.findElement(By.xpath("(//button[@class='pinkButton'])[2]"));
		verify.click();
		
		Thread.sleep(10000);
		WebElement profiledropdown=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]"));
	    profiledropdown.click();
	    
	    Thread.sleep(5000);
	    WebElement signout=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
	    signout.click();
	    
	    Thread.sleep(5000);
	    WebElement signoutyes=driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[2]"));
	    signoutyes.click();	
		
	 }


}
