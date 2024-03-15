package SeleniumAssignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		
		//click the FindLeads in the tab
		driver.findElement(By.partialLinkText("Find Leads")).click();
		//click the phone tab
		driver.findElement(By.partialLinkText("Phone")).click();
		
		//type the phonenumber
		driver.findElement(By.name("phoneNumber")).sendKeys("9789814492");
		
		//click the findleads
		driver.findElement(By.className("x-btn-text")).click();
		
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Lead deleted successfully");
		} else {
			System.out.println("Lead is not deleted ");
		}
		driver.close();
	}
}

	
		
		
	


