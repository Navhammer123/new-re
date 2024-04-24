package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fileup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		
		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
		
		input.sendKeys("new data");
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		
		Select drop = new Select (driver.findElement(By.id("animals")));
		
		drop.selectByValue("big baby cat");
		

		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//label//span")).getText());
		
		
		
		

	}

}
