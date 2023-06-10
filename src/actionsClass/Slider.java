package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class Slider {


	public static void main(String[] args) {
		WebDriver d = Base.intibrowser("https://jqueryui.com/slider/");

		WebElement frame = d.findElement(By.xpath("//*[@class='demo-frame']"));
		d.switchTo().frame(frame);
		
		WebElement slider = d.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
		Actions act = new Actions(d);
		act.clickAndHold(slider).moveByOffset(500, 0).release().build().perform();
		
	}
}
