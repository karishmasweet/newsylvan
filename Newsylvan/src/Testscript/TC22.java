package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC22 extends baseclassone
{
	@Test
	public void signinparent_leaveusernameblank_leaveblankpassword() throws InterruptedException
	{
		String expected="First name is required.";
		String expected1="Last name is required.";
		String expected2="Email is required.";
		String expected3="Email and confirm email do not match.";
		String expected4="Mobile Phone Number number is required.";
		String expected5="Username must contain a minimum of 6 characters and can contain letters and numbers.";
		String expected6="Password must include a minimum of 8 characters, one uppercase letter, one lowercase letter, and one number.";
		
		WebElement Signup=driver.findElement(By.xpath("//button[@id='navbarDropdownMenuLink4']"));
		Signup.click();
		
		Thread.sleep(5000);
		WebElement parent=driver.findElement(By.xpath("(//a[text()='I’m a  Parent'])[2]"));
		parent.click();
		
//		Thread.sleep(5000); 
//		 JavascriptExecutor je = (JavascriptExecutor) driver;
//			je.executeScript("window.scrollBy(0,400)");
		
			Thread.sleep(5000);
		    WebElement create=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
			create.click();	
			
		String pop=driver.findElement(By.xpath("//div[contains(text(),'First name is required.')]")).getText();
		String pop1=driver.findElement(By.xpath("//div[contains(text(),'Last name is required.')]")).getText();
		String pop2=driver.findElement(By.xpath("//div[contains(text(),'Email is required.')]")).getText();
		String pop3=driver.findElement(By.xpath("//div[contains(text(),'Email and confirm email do not match.')]")).getText();
		String pop4=driver.findElement(By.xpath("//div[contains(text(),'Mobile Phone Number number is required.')]")).getText();
		String pop5=driver.findElement(By.xpath("//div[contains(text(),'Username must contain a minimum of 6 characters and can contain letters and numbers.')]")).getText();
		String pop6=driver.findElement(By.xpath("//div[contains(text(),'Password must include a minimum of 8 characters, one uppercase letter, one lowercase ')]")).getText();
		Assertions2.assert1(expected,pop);
		System.out.println(pop);
		Assertions2.assert1(expected1,pop1);
		System.out.println(pop1);
		Assertions2.assert1(expected2,pop2);
		System.out.println(pop2);
		Assertions2.assert1(expected3,pop3);
		System.out.println(pop3);
		Assertions2.assert1(expected4,pop4);
		System.out.println(pop4);
		Assertions2.assert1(expected5,pop5);
		System.out.println(pop5);
		Assertions2.assert1(expected6,pop6);
		System.out.println(pop6);
		
	}
		

}
