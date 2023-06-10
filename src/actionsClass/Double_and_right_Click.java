package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class Double_and_right_Click {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d = Base.intibrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	//	WebDriver d = Base.intibrowser("https://www.amazon.in");
		WebElement p1 = d.findElement(By.xpath("//input[@id='double-click']"));

		Actions act = new Actions(d);
		act.doubleClick(p1).perform();
        d.switchTo().alert().accept();
        Thread.sleep(1000);
        act.contextClick(p1).perform();
	}
}
