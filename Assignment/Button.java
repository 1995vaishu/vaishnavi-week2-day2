package week2.day2;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();

		WebElement button = driver.findElement(By.xpath("//a[@href='pages/Button.html']/img"));
		driver.findElement(By.xpath("//a[@href='pages/Button.html']/img")).click();
		org.openqa.selenium.Point location = button.getLocation();
		int x = location.getX();
		int y = location.getY();

		System.out.println("x and y axis is:" + x + y);
		int buttonWidth = button.getSize().getWidth();
		System.out.println("the Width is" + buttonWidth);
		int buttonHeight = button.getSize().getHeight();
		System.out.println("the height is" + buttonHeight);
		//String color = driver.findElement(By.xpath("//a[@href='pages/Button.html']/img")).getCssValue("color");
		//System.out.println("the color is" + color);//*
		String buttonColorAsRGB = driver.findElement(By.xpath("//label[text()='Find button color']/following-sibling::button")).getCssValue("background-color");
		System.out.println("Button color in RGB value "+buttonColorAsRGB);
		
		String buttonColorAsString = driver.findElement(By.xpath("//button[@id='color']")).getAttribute("style");
		System.out.println("Button color in style value "+buttonColorAsString);
			
		org.openqa.selenium.Dimension buttonHW = driver.findElement(By.xpath("//label[text()='Find the height and width']/following-sibling::button")).getSize();
		System.out.println("Height and width of the button : "+buttonHW); 
	}

}
