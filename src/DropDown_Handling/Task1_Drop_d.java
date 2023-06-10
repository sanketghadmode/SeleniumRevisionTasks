package DropDown_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;

public class Task1_Drop_d {
	

	 public static void main(String [] args) throws InterruptedException
	 {
		 WebDriver d = Base.intibrowser("https://www.google.com");
		 
		 WebElement search = d.findElement(By.xpath("//*[@id='APjFqb']"));
		 search.sendKeys("Selenium");
		 
		 Thread.sleep(3000);
		WebElement cl = d.findElement(By.xpath("//*[@id='gLuoSb']"));
		cl.click();
				 
	 }
	
	
	
}
