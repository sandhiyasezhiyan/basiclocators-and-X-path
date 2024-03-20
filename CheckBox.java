package SeleniumAssignment2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
	    driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]")).click();
	    System.out.println(driver.findElement(By.xpath("//span[text()='State has been changed.']")).isSelected());
	    driver.findElement(By.xpath("(//div[@class='ui-toggleswitch ui-widget']//div)[2]")).click();
	    System.out.println(driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')])[3]")).isSelected());
	    driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
	    driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[2]/div[1]/div[2]")).click();
	    driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
	    
		driver.close();
		
	}

}
