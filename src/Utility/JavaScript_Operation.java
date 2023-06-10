package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScript_Operation {
	
	
	public static void main(String[] args) {
		
		WebDriver d = Base.intibrowser("https://www.spotify.com/in-en/signup");
		
		// enter text by using java script Executor
		
		WebElement se = d.findElement(By.xpath("//*[@id='email']"));
		
		//send keys using java Script
		JavascriptExecutor js=((JavascriptExecutor)d);
		// js.executeScript("arguments[0].value = 'alternate way to use sendKeys'",se);

	   // Scroll 
		 WebElement scroll = d.findElement(By.xpath("//*[text()='Have an account? ']"));
		// js.executeScript("scrollBy(0,2000)");
		 js.executeScript("argumetns[0].scrollIntoView();",scroll);
		 
	}

}
