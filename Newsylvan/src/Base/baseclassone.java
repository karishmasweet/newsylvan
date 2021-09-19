package Base;

import java.io.IOException;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclassone
{
	public ChromeDriver driver;
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
	 }
	
	@AfterMethod
	public void close()
	{
		//driver.close();
	}
}
