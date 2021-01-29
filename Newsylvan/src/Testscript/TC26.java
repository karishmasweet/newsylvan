package Testscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC26 extends baseclassone
{
	@Test
	public void wallet_delete() throws InterruptedException, AWTException
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
		WebElement mywallet=driver.findElement(By.xpath("//a[contains(text(),'My Wallet')]"));
		mywallet.click();
		
		Thread.sleep(5000);
		WebElement delete=driver.findElement(By.xpath("(//img[@class='pointer'])[1]"));
		delete.click();
		
		Thread.sleep(5000);
	    WebElement ok=driver.findElement(By.xpath("(//button[@class='pinkButton arrow-btn'])[3]"));
	    ok.click();
	}

}
