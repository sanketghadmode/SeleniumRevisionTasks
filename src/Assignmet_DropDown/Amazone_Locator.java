package Assignmet_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone_Locator

{
         public static void main(String []args)
         {
        	 
        	 WebDriver d = new ChromeDriver();       	 
        	 
        	 d.manage().window().maximize();
        	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	 
        	 d.get("https://www.amazon.in");
        	 
        	 List<WebElement> list = d.findElements(By.xpath("//div//div[text()='Make Money with Us']/parent::div/ul/li"));
        	 
        	 for(WebElement el : list)
        	 {
        		
        		 System.out.println( el.getText());
        	 }
        	 
        	 
         }
}
