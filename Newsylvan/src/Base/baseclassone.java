package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclassone
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	 public void browserlaunch() throws InterruptedException, IOException
	 {
		System.setProperty("webdriver.chrome.driver","../Newsylvan/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		 options.setPageLoadStrategy(PageLoadStrategy.NONE);
		 driver=new ChromeDriver(options);
	     driver.manage().window().maximize();
	     driver.get("https://signinsylvantest.clicklabs.in/");
	     Thread.sleep(10000);
	     
	     File f=new File("../Newsylvan/locators.properties");
	     FileInputStream fi=new FileInputStream(f);
	     pr= new Properties();
	     pr.load(fi);
	     
	 }
	
	@AfterMethod
	public void close()
	{
		//driver.close();
	}
}
