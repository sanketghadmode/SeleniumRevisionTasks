package DropDown_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;

public class Task2_List_DropDwn {

	
	public static void main(String [] args)
	{
		
		WebDriver d = Base.intibrowser("https://paytm.com/recharge");
		
		WebElement cl = d.findElement(By.xpath("//*[@class='_1exI']//input"));
		cl.click();
	
	    List<WebElement>list =d.findElements(By.xpath("//*[@class='_3xI1']//ul//li"));
	    
	    for(WebElement All:list)
	    {
	    	System.out.println(All.getText());
	    	
	    }
	
	}
}
