package assigment_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class Enter_Copy_past {


	public static void main(String [] args) throws InterruptedException
	{
		WebDriver d = Base.intibrowser("https://www.google.com");

		WebElement S = d.findElement(By.xpath("//*[@id='APjFqb']"));
		S.sendKeys("India");

		Actions a = new Actions(d);

		S.click();
		
		a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		a.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		S.clear();
		Thread.sleep(1000);
		S.click();
		a.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	    a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
	    Thread.sleep(1000);
	    a.sendKeys(Keys.ARROW_UP).perform();
	    
	   
	
	}
}
