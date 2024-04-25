package newpack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.script.RegExpValue;
import org.openqa.selenium.chrome.ChromeDriver;

public class webe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Actions action = new Actions(driver);
		driver.get("https://jqueryui.com/autocomplete/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement data = driver.findElement(By.id("tags"));
		data.sendKeys("as");
		List<WebElement> it = driver.findElements(By.cssSelector("ul#ui-id-1>li"));
		
		System.out.println(it.size());
		for (WebElement item :it) {
			
			System.out.println(item.getText());
			
			//if (item.getText().equalsIgnoreCase(expValue));
			//item.click();
			break;
			
			
		}
		

	}

}
