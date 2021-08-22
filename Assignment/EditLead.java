package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead {
public static void main(String[] args) throws InterruptedException   {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Keerthana");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page : "+pageTitle);
		if(pageTitle.equalsIgnoreCase("View Lead | opentaps CRM"))
			System.out.println("Verified the Page title");
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement comName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		 String companyName = comName.getAttribute("value");
		comName.clear();
		comName.sendKeys("BNYM");
		System.out.println("Company name before update : "+companyName);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String updatedComName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Updated Company Name is :"+updatedComName);
		if(companyName.equalsIgnoreCase(updatedComName))
			System.out.println("Company name not updated");
		else	
			System.out.println("Confirmation for Updated Company Name");
		
}

}
