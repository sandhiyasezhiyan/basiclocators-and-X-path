package SeleniumAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//enter the credentials and submit
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click the SFA link
		driver.findElement(By.partialLinkText("SFA")).click();
		
		//click the Leads
		driver.findElement(By.partialLinkText("Leads")).click();
		
		//Click the create lead
		driver.findElement(By.partialLinkText("Create Lead")).click();
		
		//Enter the companyname
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infosys");
		
		//enter the firstname by using X-path
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("gowtham");
		//enter the lastname by using X-path
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("ponnuswamy");
		
		//enter the department name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		
		//enter the description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Company product is good");
		
		//enter the email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gowtham03@gmail.com");
		
		//select the newyork value in state/province field by using SelectByVisibleText
		WebElement SourceSP= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sec1 = new Select(SourceSP);
		sec1.selectByVisibleText("New York");
		
		
		//click the create lead button
		driver.findElement(By.className("smallSubmit")).click();
		//click the edit button
		driver.findElement(By.partialLinkText("Edit")).click();
		
		//enter the importantnote field and type some text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("it is good");
		
		//click update button
		driver.findElement(By.className("smallSubmit")).click();
		
		//get the title of the application
		System.out.println(driver.getTitle());
		
		//close the window
        driver.close();
		
		
		
		
		
		
		
		
	}
}
