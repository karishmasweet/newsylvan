package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonfunction 
{
	public static void Wait(WebDriver driver,WebElement Element) 
	{
		WebDriverWait wait=new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.elementToBeClickable(Element));
	}

}
