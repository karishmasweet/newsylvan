package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC23 extends baseclassone
{
@Test
	
	public void Myprofile_parent() throws InterruptedException
	{
	WebElement Signin=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink3']"));
	Signin.click();
	
	Thread.sleep(5000);
	WebElement parentlogin=driver.findElement(By.xpath("(//a[text()='I’m a  Parent'])[1]"));
	parentlogin.click();
	
	Thread.sleep(5000);
	WebElement username=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
	username.sendKeys("test1405");
	
	Thread.sleep(5000);
	WebElement passwordparent=driver.findElement(By.xpath("//input[@name='pasword']"));
	passwordparent.sendKeys("Qwerty@123");
	
	Thread.sleep(5000);
	WebElement signclick=driver.findElement(By.xpath("//button[@id='btnsubmit']"));
	signclick.click();
	
	//WebDriverWait wait=new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]")));
	Thread.sleep(12000);
	WebElement profile=driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]"));
	Thread.sleep(5000);
	profile.click();
	
	Thread.sleep(5000);
	WebElement Myprofile=driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
	Myprofile.click();
	
	//driver.get("https://parentsylvantest.clicklabs.in/pages/profile/parent-profile");
	
	Thread.sleep(5000); 
	 JavascriptExecutor je = (JavascriptExecutor) driver;
	 je.executeScript("window.scrollBy(0,400)");
	 
	Thread.sleep(5000);
	WebElement Addaddress=driver.findElement(By.xpath("(//span[@class='proximanova-semibold'])[1]"));
	Addaddress.click();	
	
	Thread.sleep(5000);
	WebElement autofill=driver.findElement(By.xpath("//input[@placeholder='Enter the address']"));
    autofill.sendKeys("1234 Massachusetts Avenue, Cambridge");
    Thread.sleep(2000);
	autofill.sendKeys(Keys.ARROW_DOWN);
	autofill.sendKeys(Keys.ENTER);
	
	Thread.sleep(5000);
	WebElement select_address=driver.findElement(By.xpath("//button[@class='saveAddress pointer arrow-btn']"));
	select_address.click();	
	
	Thread.sleep(5000);
	WebElement save_location=driver.findElement(By.xpath("//button[@class='loginButton arrow-btn pointer']"));
	save_location.click();
	
	Thread.sleep(5000); 
	 JavascriptExecutor ja = (JavascriptExecutor) driver;
	 ja.executeScript("window.scrollBy(0,400)");
	 
	Thread.sleep(5000);
	WebElement Add_child=driver.findElement(By.xpath("(//span[@class='proximanova-semibold'])[2]"));
	Add_child.click();	
	
	Thread.sleep(5000);
	WebElement first_name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	first_name.sendKeys("Test");
	
	Thread.sleep(5000);
	WebElement last_name=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	last_name.sendKeys("sylvan");
	
	Thread.sleep(5000);
	WebElement calender=driver.findElement(By.xpath("//button[@aria-label='Open calendar']"));
	calender.click();
	
	Thread.sleep(5000);
	WebElement dob=driver.findElement(By.xpath("(//div[@class='mat-calendar-body-cell-content'])[1]"));
	dob.click();
	
	Thread.sleep(5000);
	WebElement choose_male=driver.findElement(By.xpath("(//div[@class='mat-select-value'])[1]"));
	choose_male.click();
	
	Thread.sleep(5000);
	WebElement male=driver.findElement(By.xpath("//mat-option[@value='MALE']"));
	male.click();
	
	Thread.sleep(5000);
	WebElement choose_grade=driver.findElement(By.xpath("(//div[@class='mat-select-value'])[2]"));
	choose_grade.click();
	
    Thread.sleep(5000);
	WebElement choose_k=driver.findElement(By.xpath("//mat-option[@value='K']"));
	choose_k.click();
	
	Thread.sleep(5000);
	WebElement save_child=driver.findElement(By.xpath("//button[contains(text(),'Save Child ')]"));
	save_child.click();
		 
   Thread.sleep(5000);
   WebElement save_profile=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
   save_profile.click();
		
	}



}
