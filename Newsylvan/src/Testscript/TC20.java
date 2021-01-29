package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC20 extends baseclassone
{
	@Test
	public void signinparent_leaveusernameblank_leaveblankpassword() throws InterruptedException
	{
		String expected="Please enter your username.";
		String expected1="Please enter your password.";
		
		WebElement Signin=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink3']"));
		Signin.click();
		
		Thread.sleep(5000);
		WebElement parent=driver.findElement(By.xpath("(//a[text()='I’m a  Parent'])[2]"));
		parent.click();
		
		Thread.sleep(5000);
	    WebElement create=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		create.click();	
		
		String pop=driver.findElement(By.xpath("//div[contains(text(),'Please enter your username.')]")).getText();
		String pop2=driver.findElement(By.xpath("(//div[contains(text(),'Please enter your password.')])[1]")).getText();
		Assertions2.assert1(expected,pop);
		System.out.println(pop);
		Assertions2.assert1(expected1,pop2);
		System.out.println(pop2);
	}
		

}
