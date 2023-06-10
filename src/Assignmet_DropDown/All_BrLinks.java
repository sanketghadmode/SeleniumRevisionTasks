package Assignmet_DropDown;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_BrLinks {

	
	public static void mian(String [] args)
	{
 
		WebDriver d = new ChromeDriver();
	   	 d.manage().window().maximize();
	   	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	 d.get("https://www.kokuyocamlin.com/");
		
	}
	
	
}
