package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;

public class All_alert_with_fileUpload {

	
	
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver d = Base.intibrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		WebElement alt = d.findElement(By.xpath("//*[@name='alert']"));
		WebElement Con_alt = d.findElement(By.xpath("//*[@name='confirmation']"));
		WebElement upload_alt = d.findElement(By.xpath("//*[@name='upload']"));
		
		
		alt.click();
		d.switchTo().alert().accept();
		Thread.sleep(2000);
		Con_alt.click();
		Thread.sleep(1000);
		d.switchTo().alert().dismiss();
		Thread.sleep(1000);
		upload_alt.sendKeys("C:\\Users\\AKG\\OneDrive\\Pictures\\Screenshots");
		
		
	}
}
