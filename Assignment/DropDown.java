package week2.day2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement webDrpDwn1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select drpDwn1 = new Select(webDrpDwn1);
		drpDwn1.selectByIndex(1);
		
		WebElement webDrpDwn2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select drpDwn2 = new Select(webDrpDwn2);
		drpDwn2.selectByVisibleText("Selenium");
		
		WebElement webDrpDwn3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select drpDwn3 = new Select(webDrpDwn3);
		drpDwn3.selectByValue("1");
		
		WebElement webDrpDwn4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select drpDwn4 = new Select(webDrpDwn4);
		drpDwn4.selectByValue("1");
		int drpDwnSize = drpDwn4.getOptions().size();
		System.out.println("Size of the 3rd dropdown is :"+drpDwnSize);
		
		WebElement webDrpDwn5 = driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select"));
		webDrpDwn5.sendKeys("Selenium");		
		
		WebElement webDrpDwn6 = driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
		Select drpDwn6 = new Select(webDrpDwn6);
		drpDwn6.selectByValue("1");
		
		
	}
}
