package actionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class MouseHover_andClick {

	
  public static void main(String[] args) {
	WebDriver d = Base.intibrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	
	WebElement dp = d.findElement(By.xpath("//*[@class='dropdown']"));
	 
	  Actions act = new Actions(d);
	  act.moveToElement(dp).perform();
	  
	  List<WebElement> list = d.findElements(By.xpath("//*[@class='dropdown-content']//a"));
	  
	   for(WebElement all : list)
	   {
		   String names = all.getText();
		   if(names.equalsIgnoreCase("Google"))
		   {
			   all.click();
			   break;
		   }
	   }
}
}
