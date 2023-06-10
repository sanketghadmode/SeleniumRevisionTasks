package DropDown_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;

public class Task_Drop_dwn_3 {

	
	public static void main(String [] args)
	{
		
		WebDriver d = Base.intibrowser("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		WebElement serach = d.findElement(By.xpath("//*[@id='fromPlaceName']"));
		
		serach.sendKeys("shi");
		
		List<WebElement>list = d.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		
		for(WebElement All:list)
		{
			System.out.println(All.getText());
		}
		
		
	}
	
	
	
}
