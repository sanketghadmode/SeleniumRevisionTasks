package DropDown_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;

public class Task4 {

	public static void main(String [] args) throws InterruptedException
	{
		WebDriver d = Base.intibrowser("https://www.google.com");

		WebElement search = d.findElement(By.xpath("//*[@id='APjFqb']"));
	
		search.sendKeys("Selenium");
		
	   WebElement text =  	d.findElement(By.xpath("//*[@name='q']"));
	   System.out.println( text.getText());
	  
		
	}
}
