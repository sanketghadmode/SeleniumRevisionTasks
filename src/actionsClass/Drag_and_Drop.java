package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utility.Base;

public class Drag_and_Drop {

	public static void main(String[] args) {

		WebDriver d = Base.intibrowser("https://jqueryui.com/droppable/");

         
		WebElement frame = d.findElement(By.xpath("//*[@class='demo-frame']"));
		d.switchTo().frame(frame);
		
		WebElement drag = d.findElement(By.xpath("//*[@id='draggable']"));
		WebElement drop_here = d.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act = new Actions(d);
		act.dragAndDrop(drag, drop_here).release().build().perform();

	}
}
