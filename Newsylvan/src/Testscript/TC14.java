package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Assertion.Assertions2;
import Base.baseclassone;

public class TC14 extends baseclassone
{
	@Test
	public void forgotusernameparent_blankemailid() throws InterruptedException
	{
		String expected="Email is required.";
		
		WebElement username=driver.findElement(By.xpath("//a[contains(text(),'Username')]"));
		username.click();
		
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.xpath("//span[contains(text(),'Are you a parent or tutor?')]"));
		dropdown.click();
		
		Thread.sleep(5000);
		WebElement parent=driver.findElement(By.xpath("//md-option[@value='parent']"));
		parent.click();
		
		Thread.sleep(5000);
		WebElement parentsubmit=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		parentsubmit.click();
		
		Thread.sleep(5000);
		String pop=driver.findElement(By.xpath("//div[contains(text(),'Email is required.')]")).getText();
		System.out.println(pop);
		
		Assertions2.assert1(expected,pop);
	}

}
