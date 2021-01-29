package Testscript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC25 extends baseclassone
{
	@Test
	public void parent_Mywallet() throws InterruptedException, AWTException
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
		WebElement addcard=driver.findElement(By.xpath("//label[contains(text(),'Add New Card')]"));
		addcard.click();
		
		Thread.sleep(5000);
		WebElement cardholder_name=driver.findElement(By.xpath("//input[@placeholder='Cardholder Name']"));
		cardholder_name.sendKeys("kanika");
		
		Thread.sleep(5000);
		WebElement cardnumber=driver.findElement(By.xpath("//input[@id='cardNumber']"));
		cardnumber.sendKeys("4242424242424242");
		
		Thread.sleep(5000);
	    WebElement expiredate=driver.findElement(By.xpath("(//div[@class='mat-select-value'])[1]"));
	    expiredate.click();
	    
	    Thread.sleep(5000);
	    WebElement May=driver.findElement(By.xpath("//mat-option[@ng-reflect-value='May']"));
	    May.click();
	    
	   
	    Thread.sleep(5000);
	    WebElement expireyear=driver.findElement(By.xpath(" (//div[@class='mat-select-value'])[2]"));
	    expireyear.click();
		
	    Thread.sleep(5000);
	    WebElement year=driver.findElement(By.xpath("//mat-option[@ng-reflect-value='2024']"));
	    year.click(); 
	    
	    Thread.sleep(5000);
	    WebElement cvv=driver.findElement(By.xpath("//input[@id='cvv']"));
	    cvv.sendKeys("456");
	    
	   
	    Thread.sleep(5000);
	    WebElement billingaddress=driver.findElement(By.xpath(" (//div[@class='mat-checkbox-inner-container'])[1]"));
	    billingaddress.click();	
	    
	    Thread.sleep(5000);
	    WebElement save_button=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	    save_button.click();

	    Thread.sleep(5000);
	    WebElement ok=driver.findElement(By.xpath("(//button[@class='pinkButton arrow-btn'])[3]"));
	    ok.click();
		
	}

}
