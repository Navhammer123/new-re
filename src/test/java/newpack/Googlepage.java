package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Googlepage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("page title .." + driver.getTitle());
		
		WebElement search = driver.findElement(By.id("APjFqb"));
		
		search.sendKeys("cricket");
		search.sendKeys(Keys.ENTER);
		
		
		
		

	}

}
