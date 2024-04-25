package newpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class extexttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestingplayground.com/ajax");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.id("ajaxButton")).click();

		wait.until(ExpectedConditions.textToBePresentInElement
				(driver.findElement(By.cssSelector("div#content")),"Data loaded with AJAX get request."));
	String st= driver.findElement(By.id("content")).getText();
	
	System.out.println(st);
		
		
		

}
}
