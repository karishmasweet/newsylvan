package Testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.baseclassone;

public class TC24 extends baseclassone
{
	@Test
	 
	 public void tutor_Myprofile() throws InterruptedException, AWTException
	 {
//		WebElement Signup=driver.findElement(By.xpath("//button[@id='navbarDropdownMenuLink4']"));
//		Signup.click();
//		
//		Thread.sleep(5000);
//		WebElement Tutor=driver.findElement(By.xpath("(//a[text()='I’m a  Tutor'])[2]"));
//		Tutor.click();
//		
//		Thread.sleep(5000);
//		WebElement fname=driver.findElement(By.xpath("//input[@name='fname']"));
//		fname.sendKeys("Rameshtest");
//		
//		Thread.sleep(5000);
//		WebElement lastname=driver.findElement(By.xpath("//input[@name='lname']"));
//		lastname.sendKeys("testverma");
//		
//		Thread.sleep(5000);
//		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
//		email.sendKeys("tutor120081@yopmail.com");
//		
//		Thread.sleep(5000);
//		WebElement confirmemail=driver.findElement(By.xpath("//input[@placeholder='Confirm Email Address']"));
//		confirmemail.sendKeys("tutor120060@yopmail.com");
//		
//		Thread.sleep(5000);
//		WebElement mobile=driver.findElement(By.xpath("//input[@placeholder='Mobile Phone Number']"));
//		mobile.sendKeys("9185060911");
//		
//		Thread.sleep(5000);
//		WebElement username=driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
//		username.sendKeys("tutor120060");
//		
//		Thread.sleep(5000);
//		WebElement Password=driver.findElement(By.xpath("(//input[@placeholder='Password'])[2]"));
//		Password.sendKeys("Qwerty@123");
//		
//		
//		Thread.sleep(5000);
//	    WebElement create=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
//		create.click();		
//		
//		Thread.sleep(5000);
//	    WebElement otp=driver.findElement(By.xpath("//input[@ng-reflect-klass='verifyOtp']"));
//		otp.sendKeys("0000");
//		
//		Thread.sleep(5000);
//	    WebElement verify=driver.findElement(By.xpath("(//button[@class='pinkButton'])[2]"));
//		verify.click();
		
		WebElement Signin=driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink3']"));
		Signin.click();
		
		Thread.sleep(5000);
		WebElement parentlogin=driver.findElement(By.xpath("(//a[text()='I’m a  Tutor'])[1]"));
		parentlogin.click();
		
		Thread.sleep(5000);
		WebElement username=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		username.sendKeys("tutor130080");
		
		Thread.sleep(5000);
		WebElement passwordparent=driver.findElement(By.xpath("//input[@name='pasword']"));
		passwordparent.sendKeys("Qwerty@123");
		
		Thread.sleep(5000);
		WebElement signclick=driver.findElement(By.xpath("//button[@id='btnsubmit']"));
		signclick.click();
		
		//driver.get("https://tutorsylvantest.clicklabs.in/pages/profile/profile");
		
		Thread.sleep(15000);
		//WebElement Myapplication=driver.findElement(By.xpath("//a[contains(text(),'My Application')]"));
		WebElement Myapplication=driver.findElement(By.partialLinkText("My Application"));
	    Myapplication.click();
	    
//	    Thread.sleep(5000);
//		WebElement addaddress=driver.findElement(By.xpath("//span[contains(text(),'+ Add Address')]"));
//	    addaddress.click();
//	    
//	    Thread.sleep(5000);
//		WebElement autofill=driver.findElement(By.xpath("//input[@placeholder='Enter the address']"));
//	    autofill.sendKeys("1234 Massachusetts Avenue, Cambridge");
//	    Thread.sleep(2000);
//		autofill.sendKeys(Keys.ARROW_DOWN);
//		autofill.sendKeys(Keys.ENTER);
//		
//		Thread.sleep(5000);
//		WebElement select_address=driver.findElement(By.xpath("//button[@class='saveAddress']"));
//		select_address.click();	
		
//		Thread.sleep(5000);
//		WebElement save_location=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		save_location.click();
				
//		Thread.sleep(5000);
//		WebElement save=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		save.click();
		
//		Thread.sleep(5000);
//		WebElement brief=driver.findElement(By.xpath("//textarea[@formcontrolname='experience']"));
//		brief.sendKeys("test");
//		
//		Thread.sleep(5000);
//		WebElement institue =driver.findElement(By.xpath("(//input[@id='#Institution'])[1]"));
//		institue.sendKeys("ptu");
//		
//		Thread.sleep(5000);
//		WebElement degree =driver.findElement(By.xpath("//input[@id='#Degree']"));
//		degree.sendKeys("mtech");
//		
//		Thread.sleep(5000);
//		WebElement subject =driver.findElement(By.xpath("//input[@id='#Subject']"));
//		subject.sendKeys("operating system");
//		
//		Thread.sleep(5000);
//		WebElement year =driver.findElement(By.xpath("(//select[contains(@class,'form-control stepOneInput ng-untouched ng-pristine ng-valid')])[1]"));
//		Select y=new Select(year);
//		y.selectByVisibleText("1962");
//		
//		Thread.sleep(5000);
//		WebElement usa =driver.findElement(By.xpath("(//select[contains(@class,'form-control stepOneInput ng-untouched ng-pristine ng-valid')])[2]"));
//		Select u=new Select(usa);
//		u.selectByVisibleText("USA");
//		
//		
//		Thread.sleep(5000);
//		WebElement state =driver.findElement(By.xpath("(//select[contains(@class,'form-control stepOneInput ng-untouched ng-pristine ng-valid')])[3]"));
//		Select s=new Select(state);
//		s.selectByVisibleText("California");
//		
//		
//		Thread.sleep(5000);
//		WebElement school =driver.findElement(By.xpath("(//input[@id='#Institution'])[2]"));
//		school.sendKeys("School");
		
	
//		Thread.sleep(5000);
//		WebElement radio =driver.findElement(By.xpath("(//span[@class='checkImage'])[2]"));
//		radio.click();
//		
//		Thread.sleep(5000);
//		WebElement k2 =driver.findElement(By.xpath("//p[contains(text(),'K-2')]"));
//		k2.click();
		
//		Thread.sleep(5000);
//		WebElement Add =driver.findElement(By.xpath("(//span[contains(text(),'Add')])[2]"));
//		Add.click();
//		
//		Thread.sleep(5000);	
//		WebElement subject =driver.findElement(By.xpath("(//label[@for='checkbox_arts_painting'])[1]"));
//		subject.click();
//		
//		Thread.sleep(5000);
//		WebElement save=driver.findElement(By.xpath("//button[@class='saveSteps justify']"));
//		save.click();
//		
//		Thread.sleep(5000);
//		WebElement next=driver.findElement(By.xpath("(//button[@class='saveSteps justify arrow-btn'])[4]"));
//		next.click();
		
//		Thread.sleep(5000);
//		WebElement radioone=driver.findElement(By.xpath("(//span[@class='checkImage'])[3]"));
//		radioone.click();	
//		
//		Thread.sleep(5000);
//		WebElement radiotwo=driver.findElement(By.xpath("(//span[@class='checkImage'])[5]"));
//		radiotwo.click();	
//		
//	    Thread.sleep(5000);
//		WebElement radiothree=driver.findElement(By.xpath("(//span[@class='checkImage'])[6]"));
//		radiothree.click();
//		
//		Thread.sleep(5000);
//		WebElement radiofour=driver.findElement(By.xpath("(//span[@class='checkImage'])[9]"));
//		radiofour.click();
//		
//		Thread.sleep(5000);
//		WebElement radiofive=driver.findElement(By.xpath("(//span[@class='checkImage'])[10]"));
//		radiofive.click();
//		
//		Thread.sleep(5000);
//		WebElement nextclick=driver.findElement(By.xpath("(//button[@class='saveSteps justify arrow-btn'])[7]"));
//		nextclick.click();
//		
//		Thread.sleep(5000);
//		WebElement profileheadline=driver.findElement(By.xpath("//input[@formcontrolname='Headline']"));
//		profileheadline.sendKeys("testing");
//	
//		Thread.sleep(5000);
//		WebElement about=driver.findElement(By.xpath("//textarea[@formcontrolname='about']"));
//		about.sendKeys("testingone");
//		
//		Thread.sleep(5000);
//		WebElement hour=driver.findElement(By.xpath("(//input[@type='text'])[10]"));
//		hour.sendKeys("40");
//		
//		Thread.sleep(5000);
//		WebElement policy=driver.findElement(By.xpath("(//input[@formcontrolname='policy'])[1]"));
//		policy.click();
//		
//		Thread.sleep(5000);
//		WebElement policyone=driver.findElement(By.xpath("(//input[@formcontrolname='policy'])[2]"));
//		policyone.click();
	    
//	    Thread.sleep(5000);
//		WebElement nextone=driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
//		nextone.click();
	    
//	    Thread.sleep(5000);
//		WebElement Firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//		Firstname.sendKeys("karishma");
//		
//		Thread.sleep(5000);
//		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//		lastname.sendKeys("malhotra");
//		
//		Thread.sleep(5000);
//		WebElement radiobuttonconfirm=driver.findElement(By.xpath("(//span[@class='pink'])[2]"));
//		radiobuttonconfirm.click();
//		
//		Thread.sleep(5000);
//		WebElement dob=driver.findElement(By.xpath("//select[@formcontrolname='dobMonth']"));
//		Select db=new Select(dob);
//		db.selectByVisibleText("May");
//		
//		Thread.sleep(5000);
//		WebElement day=driver.findElement(By.xpath("//select[@formcontrolname='dobDay']"));
//		Select d=new Select(day);
//		d.selectByVisibleText("7");
//		
//		Thread.sleep(5000);
//		WebElement year=driver.findElement(By.xpath("//select[@formcontrolname='dobYear']"));
//		Select y=new Select(year);
//		y.selectByVisibleText("1990");
//		
//
//		Thread.sleep(5000);
//		WebElement radiobuttonfive=driver.findElement(By.xpath("(//span[@class='pink'])[3]"));
//		radiobuttonfive.click();
//		
//		Thread.sleep(5000);
//		WebElement nextfive=driver.findElement(By.xpath("(//button[@type='submit'])[5]"));
//		nextfive.click();
//		
		
//		Thread.sleep(5000);
//		WebElement radiobuttonsix=driver.findElement(By.xpath("(//span[@class='pink'])[4]"));
//		radiobuttonsix.click();
//		
//		Thread.sleep(5000);
//		WebElement nextsix=driver.findElement(By.xpath("(//button[@type='submit'])[6]"));
//		nextsix.click();
//
//	    Thread.sleep(5000);
//		WebElement sss=driver.findElement(By.xpath("//input[@placeholder='Social Security Number']"));
//	    sss.sendKeys("567-98-7139");
//	    
//	    Thread.sleep(5000);
//		WebElement radiobuttonseven=driver.findElement(By.xpath("(//span[@class='pink'])[5]"));
//		radiobuttonseven.click(); 
//		
//		Thread.sleep(5000);
//		WebElement signature=driver.findElement(By.xpath("//input[@placeholder='Signature']"));
//	    signature.sendKeys("karishma");
//	    
//	    Thread.sleep(5000);
//		WebElement nextseven=driver.findElement(By.xpath("(//button[@type='submit'])[7]"));
//		nextseven.click();
//		
//		Thread.sleep(5000);
//		WebElement sound=driver.findElement(By.xpath("//button[@class='saveSteps justify pinkButoon arrow-btn']"));
//		sound.click();
//		
//	    
	    
		
		
		//		
	  //img[@class='roundImage']
	    Thread.sleep(5000);
		WebElement uploadimage=driver.findElement(By.xpath("//img[@class='roundImage']"));		
		uploadimage.click();	
		
		 Thread.sleep(5000);
		File file = new File("/Users/karishma/git/repositoryselenium/YTFramework/screenshots/avatar.png");

				StringSelection stringSelection= new StringSelection(file.getAbsolutePath());

				//Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

				Robot robot = new Robot();

				// Cmd + Tab is needed since it launches a Java app and the browser looses focus
				System.out.println("testing with mayank");

				robot.keyPress(KeyEvent.VK_META);

				System.out.println("testing with karishma");
				robot.keyPress(KeyEvent.VK_TAB);

				robot.keyRelease(KeyEvent.VK_META);

				robot.keyRelease(KeyEvent.VK_TAB);

				//robot.delay(5000);

				//Open Goto window
//				System.out.println("testing with aanchal");
//				robot.keyPress(KeyEvent.VK_META);
//				System.out.println("testing with shubham");
//				robot.keyPress(KeyEvent.VK_SHIFT);
//
//				robot.keyPress(KeyEvent.VK_G);
//
//				robot.keyRelease(KeyEvent.VK_META);
//
//				robot.keyRelease(KeyEvent.VK_SHIFT);
//
//				robot.keyRelease(KeyEvent.VK_G);
				Thread.sleep(5000);
				 robot.keyPress(KeyEvent.VK_SLASH);
				 robot.keyRelease(KeyEvent.VK_SLASH);

				//Paste the clipboard value

				robot.keyPress(KeyEvent.VK_META);

				robot.keyPress(KeyEvent.VK_V);

				robot.keyRelease(KeyEvent.VK_META);

				robot.keyRelease(KeyEvent.VK_V);

				//Press Enter key to close the Goto window and Upload window

				robot.keyPress(KeyEvent.VK_ENTER);

				robot.keyRelease(KeyEvent.VK_ENTER);

				robot.delay(5000);

				robot.keyPress(KeyEvent.VK_ENTER);

				robot.keyRelease(KeyEvent.VK_ENTER);
				
				
	    
	 }
}
