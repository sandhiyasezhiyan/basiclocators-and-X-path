package SeleniumAssignment2;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='Chrome']")).isSelected());
		System.out.println(driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected());

		
		
	}

}
