package Assignmet_DropDown;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	
	public static void main(String [] args)
	{
		WebDriver d = new ChromeDriver();
	   	 d.manage().window().maximize();
	   	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	 d.get("https://www.facebook.com/r.php?locale=en_GB");
	   	 
	   	  List<String> drop = new ArrayList<>();
	   	  drop.add("day");
	   	  drop.add("month");
	   	  drop.add("year");
	   	 
	   	for(String dr :drop)
	   	{
	   	  WebElement el = d.findElement(By.xpath("//select[@id='"+dr+"']"));
	   	  Select s = new Select(el);
	   	  el.click();
	   	  List<WebElement> all = d.findElements(By.xpath("//select[@id='"+dr+"']/child::option"));
	   	  
	   	  for(WebElement list:all)
	   	  {
	   		 
              System.out.println( list.getText());
           
	   		  
	   	  }
	     
	   	}
}}
