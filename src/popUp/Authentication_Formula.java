package popUp;

import org.openqa.selenium.WebDriver;

import Utility.Base;

public class Authentication_Formula {

	
	public static void main(String[] args) {
		
		WebDriver d = Base.intibrowser("https:postman:password@postman-echo.com/basic-auth");
		
		// here is formula to handle windows base authentication pop-Up 
		// https:username:password@URL.com
	}
}
