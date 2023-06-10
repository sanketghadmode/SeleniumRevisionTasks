package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class MouseHover {

	
	public static void main(String [] args)
	{
		WebDriver d = Base.intibrowser("https://www.amazon.in");
		
		WebElement element = d.findElement(By.xpath("//*[@id='nav-link-accountList']"));
		
		Actions A = new Actions(d);
		
		A.moveToElement(element).perform();
		
	}
}
