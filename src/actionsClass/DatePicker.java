package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class DatePicker {

	
	public static void main(String[] args) {
		
		WebDriver d = Base.intibrowser("https://jqueryui.com/datepicker/");
		WebElement frame = d.findElement(By.xpath("//*[@class='demo-frame']"));
		
		d.switchTo().frame(frame);
		WebElement datep = d.findElement(By.xpath("//*[@id='datepicker']"));
		datep.click();
		
		
		
		while(true)
		{
			String mothyear = d.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			
			if(!(mothyear.equals("September 2022")))
					{
				WebElement prev_btn = d.findElement(By.xpath("//a[@data-handler='prev']//span"));
				prev_btn.click();   
			
					}
			else {break;}
		}
		  WebElement date = d.findElement(By.xpath("//*[@data-handler='selectDay']//a[text()='13']"));
		  date.click();
		  
		}

}
