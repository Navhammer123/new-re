package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Googlepage {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//		System.out.println("page title .." + driver.getTitle());
		System.out.println ("new url :" + driver.getCurrentUrl());
       //WebElement search = driver.findElement(By.id("APjFqb"));
		//WebElement search = driver.findElement(By.className("gLFyf"));
		WebElement search = driver.findElement(By.tagName("textarea"));
		
		search.sendKeys("cricket");
		search.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		
		
		
		

	}

}
