package Assignmet_DropDown;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;

public class Home_page {



	public static void main(String [] args) throws InterruptedException
	{

		WebDriver d = Base.intibrowser("https://www.kokuyocamlin.com/");

		List<WebElement> pages = d.findElements(By.xpath("//div[@class='c-header__nav is-above-1023']//a"));

         String wi1 = d.getWindowHandle();
         
		 System.out.println(wi1);
		 
		 for(WebElement itr : pages)
		 {
			
			 try {
			 itr.click();
			
			 }
			 catch(Exception e)
			 {
				 d.navigate().back();
			     itr.click();	 
			 }
			 }
	   
       
	}

	}


