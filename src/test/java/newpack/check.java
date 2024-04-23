/**
 * 
 */
package newpack;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Administrator
 *
 */
public class check {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
		Select Singsel = new Select(driver.findElement(By.id("select-demo")));
		
		Singsel.selectByValue("Monday");
		
		Select Mutisel = new Select(driver.findElement(By.id("multi-select")));
		
		if(Mutisel.isMultiple()) {
			Mutisel.selectByIndex(0);
			Mutisel.selectByValue("Texas");
			Mutisel.selectByVisibleText("Washington");
		}
		
		List<WebElement> Country = Mutisel.getAllSelectedOptions();
		
		System.out.println("SelectedCountry " + Country);
		Mutisel.deselectByValue("Washington");
		}
		
		
		//driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		//driver.findElement(By.xpath("//input[@value = '5 - 15']")).click();
		//driver.findElement(By.xpath("//input[@value = 'Male']")).click();
		//driver.findElement(By.xpath("//input[@value = 'Male'] and [@type='radio']")).click();
		//driver.findElement(By.cssSelector("button#buttoncheck")).click();
		
		//List<WebElement> N = driver.findElements(By.xpath("//td[text()='San Francisco']//preceding-sibling::td[2]"));
		//for (WebElement cell:N) {
			//System.out.println( cell.getText());
		}
				
	

	


