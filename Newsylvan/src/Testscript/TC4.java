package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC4 extends baseclassone
{
	@Test
	
	public void signin_tutor() throws InterruptedException
	{
	WebElement Signin=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink3']"));
	Signin.click();
	
	Thread.sleep(5000);
	WebElement parentlogin=driver.findElement(By.xpath("(//a[text()='I’m a  Tutor'])[1]"));
	parentlogin.click();
	
	Thread.sleep(5000);
	WebElement username=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
	username.sendKeys("mayank101");
	
	Thread.sleep(5000);
	WebElement passwordparent=driver.findElement(By.xpath("//input[@name='pasword']"));
	passwordparent.sendKeys("Qwerty@123");
	
	Thread.sleep(5000);
	WebElement signclick=driver.findElement(By.xpath("//button[@id='btnsubmit']"));
	signclick.click();
	
	Thread.sleep(10000);
	WebElement profiledropdown=driver.findElement(By.xpath("(//a[@id='navbardrop'])[2]"));
    profiledropdown.click();
    
    Thread.sleep(5000);
    WebElement signout=driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
    signout.click();
    		
    Thread.sleep(5000);
    WebElement signoutyes=driver.findElement(By.xpath("(//button[contains(text(),'Yes')])[2]"));
    signoutyes.click();
	
	
	}

}
