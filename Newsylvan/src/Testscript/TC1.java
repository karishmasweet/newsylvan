package Testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC1 extends baseclassone
{
	@Test
	public void signup_parent() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement Signup=driver.findElement(By.xpath("//button[@id='navbarDropdownMenuLink4']"));
		Signup.click();
		
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Orders')]")));
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.MILLISECONDS);
		Thread.sleep(5000);
		WebElement parent=driver.findElement(By.xpath("//a[contains(text(),'I’m a Parent')][1]"));
		parent.click();
		
		Thread.sleep(5000);
		WebElement fname=driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("Rameshtest");
		
		Thread.sleep(5000);
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lname']"));
		lastname.sendKeys("testverma");
		
		Thread.sleep(5000);
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("test120033@yopmail.com");
		
		Thread.sleep(5000);
		WebElement confirmemail=driver.findElement(By.xpath("//input[@placeholder='Confirm Email Address']"));
		confirmemail.sendKeys("test120033@yopmail.com");
		
		Thread.sleep(5000);
		WebElement mobile=driver.findElement(By.xpath("//input[@placeholder='Mobile Phone Number']"));
		mobile.sendKeys("9700356911");
		
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
		username.sendKeys("test120033");
		
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
		//Select m=new Select(Myprofile);
		//m.selectByVisibleText("Sign Out");
	    
	  
	    Thread.sleep(5000);
	    WebElement signout=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
	    signout.click();
	    
	    Thread.sleep(5000);
	    WebElement signoutyes=driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[2]"));
	    signoutyes.click();
		
		
	}


}
