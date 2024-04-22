/**
 * 
 */
package newpack;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> N = driver.findElements(By.xpath("//td[text()='B. Wagner']//following-sibling::td"));
	    System.out.println("iteams" + N.size());
	    
	    for(WebElement cell:N) {
	}

}