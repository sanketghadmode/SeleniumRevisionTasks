package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;

public class Child_Browser {

	
	public static void main(String[] args) {
		
		WebDriver d = Base.intibrowser("https://groww.in/");
		
		WebElement ele = d.findElement(By.xpath("//*[text()='Login/Register']"));
		ele.click();
		
		WebElement close = d.findElement(By.xpath("//*[@class='rodal-close']"));
		close.click();
		
	}
}
