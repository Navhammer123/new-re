package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		
		WebElement shawhost = driver.findElement(By.xpath("//my-paragraph[1]"));
		
		SearchContext contact = shawhost.getShadowRoot();
		
		WebElement txt = contact.findElement(By.cssSelector("slot[name='my text']"));
		System.out.println(txt.getText());
		

	}

}
