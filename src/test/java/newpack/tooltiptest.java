package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class tooltiptest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		driver.findElement(By.id("age")).sendKeys("20");
		
		driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
		action.moveToElement(driver.findElement(By.id("age"))).perform();
		String st = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(st);
		
		

	}

}
