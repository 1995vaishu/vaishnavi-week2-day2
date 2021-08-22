package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']/parent::div")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("rose");
		driver.findElement(By.id("lastNameField")).sendKeys("B");
		driver.findElement(By.name("firstNameLocal")).sendKeys("text");
		driver.findElement(By.name("lastNameLocal")).sendKeys("yestea");
		driver.findElement(By.name("departmentName")).sendKeys("Military");
		driver.findElement(By.name("description")).sendKeys("Hello world");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcdjh@gmail.com");
		WebElement province = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropdwn = new Select(province);
		dropdwn.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Hello world is my world");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Title of the page is "+driver.getTitle());

	}
}
