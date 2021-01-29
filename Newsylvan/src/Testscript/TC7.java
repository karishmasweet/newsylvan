package Testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC7 extends baseclassone
{
	@Test
	public void forgotpassword_parent() throws InterruptedException
	{
	WebElement password=driver.findElement(By.xpath("//a[contains(text(),'Password')]"));
	password.click();
	
	Thread.sleep(5000);
	WebElement emailaddress=driver.findElement(By.xpath("//input[@placeholder='Enter your email address.']"));
	emailaddress.sendKeys("test120012@yopmail.com");
	
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
	WebElement ok=driver.findElement(By.xpath("(//button[@class='pinkButton'])[3]"));
	ok.click();
	driver.get("http://www.yopmail.com/");
	
	Thread.sleep(5000);
	WebElement emailidbox=driver.findElement(By.xpath("//input[@id='login']"));
	emailidbox.sendKeys("test120012@yopmail.com");
	
	Thread.sleep(5000);
	WebElement checkbox=driver.findElement(By.xpath("//input[@value='Check Inbox']"));
	checkbox.click();
	
	//WebDriverWait wait=new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Reset my password')]")));
	Thread.sleep(5000);
	driver.switchTo().frame("ifmail");
	WebElement iframe=driver.findElement(By.xpath("//a[contains(text(),'Reset my password')]"));
	iframe.click();
	
	String mainWindowHandle = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();
    Iterator<String> iterator = allWindowHandles.iterator();

    // Here we will check if child window has other child windows and will fetch the heading of the child window
    while (iterator.hasNext()) {
        String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
            driver.switchTo().window(ChildWindow);
            

	Thread.sleep(5000);
	WebElement newpassword=driver.findElement(By.xpath("//input[@placeholder='New Password']"));
	newpassword.sendKeys("Qwerty@123");
	
	Thread.sleep(5000);
	WebElement confirmpassword=driver.findElement(By.xpath("//input[@placeholder='Confirm New Password']"));
	confirmpassword.sendKeys("Qwerty@123");
	
	Thread.sleep(5000);
	WebElement rst=driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]"));
	rst.click();
	
	

	
	}
    }
	}
	
}
