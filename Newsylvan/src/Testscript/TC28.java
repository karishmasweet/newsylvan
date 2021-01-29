package Testscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC28 extends baseclassone
{
	@Test
	public void Contactus() throws InterruptedException, AWTException
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
		
		Thread.sleep(10000);
		WebElement profile=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]"));
		Thread.sleep(5000);
		profile.click();
		
		Thread.sleep(5000);
		WebElement mywallet=driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[1]"));
		mywallet.click();
	
		Thread.sleep(5000);
		WebElement sendmessage=driver.findElement(By.xpath("//textarea[@ng-reflect-placeholder='How can we help you?']"));
		sendmessage.sendKeys("please send the messge");
		
		Thread.sleep(5000);
		WebElement sendok=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		sendok.click();
		
		Thread.sleep(5000);
		WebElement ok=driver.findElement(By.xpath("(//button[@class='pinkButton arrow-btn'])[3]"));
		ok.click();
		
	}

}
