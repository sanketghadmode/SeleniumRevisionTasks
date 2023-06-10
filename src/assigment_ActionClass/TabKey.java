package assigment_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class TabKey {


	public static void main(String [] args) throws InterruptedException
	{
		WebDriver d = Base.intibrowser("https://www.facebook.com/r.php?locale=en_GB");

		WebElement fistname = d.findElement(By.xpath("//*[@name='firstname']"));
		fistname.click();

		fistname.sendKeys("Sanket");

		Actions a = new Actions(d);
		a.sendKeys(Keys.TAB).sendKeys("Ghadmode").sendKeys(Keys.TAB).sendKeys("7447818516")
		.sendKeys(Keys.TAB).sendKeys("S1567").build().perform();
		
		
	



	}



}
