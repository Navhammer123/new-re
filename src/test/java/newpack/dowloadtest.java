package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dowloadtest  {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
		Thread.sleep(2000);
		WebElement div = driver.findElement(By.xpath("//a[text ()= 'chromedriver_win32.zip']"));
		
		div.click();
}

}
