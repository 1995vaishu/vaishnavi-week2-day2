package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("abcjhd@gamil.com");

		WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));

		append.clear();
		append.sendKeys("how r u");

		driver.findElement(By.name("username")).getAttribute("TestLeaf");

		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		if (driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled()) {
			driver.findElement(By.xpath("//input[@disabled='true']")).sendKeys("print text");
		}

		else {
			System.out.print(" the text box is disabled");
		}

	}

}
