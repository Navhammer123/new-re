package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@name='username'and @type='text']")).sendKeys("null");
		driver.findElement(By.id("password")).sendKeys("null!");
		driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in' or @type = 'submit']") ).click();
		WebElement l = driver.findElement(By.xpath("//div[@id='flash-messages']"));
		String act = l.getText();
		System.out.println("error msg " + act);
		
	}
	
	

}
