package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC10 extends baseclassone
{
	@Test
	public void signparent_validusername_invalidpassword() throws InterruptedException
	{
	String expected="Oops! It looks like the username you entered doesn't exist. Please try again. If you forgot your username, please click Forgot Username.";	
	    WebElement Signin=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink3']"));
		Signin.click();
		
		Thread.sleep(5000);
		WebElement parentlogin=driver.findElement(By.xpath("(//a[text()='I’m a  Parent'])[1]"));
		parentlogin.click();
		
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		username.sendKeys("mayank101");
		
		Thread.sleep(5000);
		WebElement passwordparent=driver.findElement(By.xpath("//input[@name='pasword']"));
		passwordparent.sendKeys("Qwerty");
		
		Thread.sleep(5000);
		WebElement signclick=driver.findElement(By.xpath("//button[@id='btnsubmit']"));
		signclick.click();
		
		Thread.sleep(5000);
		String pop=driver.findElement(By.xpath("//p[contains(text(),'Oops')]")).getText();
		System.out.println(pop);
		
		Assertions2.assert1(expected,pop);
		
		
	}

}
