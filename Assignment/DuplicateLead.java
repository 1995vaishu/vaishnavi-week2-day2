package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DuplicateLead {

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
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("keerthanasivashanmugam@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		WebElement Name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String firstName = Name.getText();
		System.out.println("First name in the first view page is :"+firstName);
		Name.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String frameTitle = driver.findElement(By.xpath("//div[text()='Duplicate Lead']")).getText();
		System.out.println("Checking title of the portlet "+frameTitle);
		if(frameTitle.equalsIgnoreCase("Duplicate Lead"))
			System.out.println("Verified the frame title as Duplicate Lead");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String firstNameInView = driver.findElement(By.xpath("(//span[@class='tabletext'])[4]")).getText();
		System.out.println("First Name in second view Page : "+firstNameInView);
		if(firstName.equals(firstNameInView))
		System.out.println("First Name in both the pages are same");
		// driver.close();
				
}
}
