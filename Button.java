package SeleniumAssignment2;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Button {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	System.out.println("The title is :"+driver.getTitle());
	driver.navigate().back();
	

	//driver.findElement(By.xpath("(//div[@class='card'])[2]")).isDisplayed();
	System.out.println("Disabled"+driver.getTitle());
	driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
	System.out.println(driver.findElement(By.xpath("(//div[@class='card'])[2]")).isEnabled());
	WebElement SubmitBtn=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
	org.openqa.selenium.Dimension size = SubmitBtn.getSize();
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	

	String buttoncolor = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("Save");
	System.out.println("buttoncolor:"+buttoncolor);


	System.out.println(driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background"));

	driver.close();
}
}