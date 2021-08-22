package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@data-id='123']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bengaluru ");
		driver.findElement(By.xpath("//ul[@class='autoFill']/li")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
		driver.findElement(By.xpath("//td[text()='15']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[@class='close']/i")).click();
	    //driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
	    String busSeatResult = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Total no of Seat found :" +busSeatResult);
	    Thread.sleep(1000);
	     driver.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label")).click();
	     String sleeperSeatFound = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Number of Sleeper seats found are :"+sleeperSeatFound);
	    WebElement tabElement = driver.findElement(By.xpath("//label[text()='SLEEPER']/preceding-sibling::label"));
	    tabElement.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[text()='AC']/preceding-sibling::label")).click();
	    Thread.sleep(1000);
	    String acSeatFound = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Number of AC seats found are : "+acSeatFound);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[text()='NONAC']/preceding-sibling::label")).click();
	    String nonAcAndAcSeatFound = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
	    System.out.println("Number of AC & Non AC seats found are : "+nonAcAndAcSeatFound);

			
}
}
