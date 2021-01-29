package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC19 extends baseclassone
{
	@Test
	public void signin_parent_leave_password_blank() throws InterruptedException
	{
		String expected="Please enter your password.";
		
		WebElement Signin=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink3']"));
		Signin.click();
		
		Thread.sleep(5000);
		WebElement parentlogin=driver.findElement(By.xpath("(//a[text()='I’m a  Parent'])[1]"));
		parentlogin.click();
		
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		username.sendKeys("test120012");
		
		Thread.sleep(5000);
		WebElement signclick=driver.findElement(By.xpath("//button[@id='btnsubmit']"));
		signclick.click();
		
		String pop=driver.findElement(By.xpath("//div[contains(text(),'Please')]")).getText();
		Assertions2.assert1(expected,pop);
		System.out.println(pop);
		
	}

}
