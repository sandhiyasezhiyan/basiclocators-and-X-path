package SeleniumAssignment2;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Button {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.xpath("(//span[text()='Click']/following::div)[3]")).isDisplayed());
	
	System.out.println(driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled());
	
	WebElement ele = driver.findElement(By.xpath("//span[text()='Submit']"));
	Point p = ele.getLocation();
	System.out.println(p.getX());
	System.out.println(p.getY());
	
	
	
	String buttoncolor = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("Save");
	System.out.println("buttoncolor:"+buttoncolor);
	
	WebElement SubmitBtn=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
	org.openqa.selenium.Dimension size = SubmitBtn.getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	driver.close();
	
	
	
	
	
	
	//System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("#607d8b"));
}
}
