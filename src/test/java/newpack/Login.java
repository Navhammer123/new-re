package newpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {
	

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		driver.findElement(By.cssSelector("input[data-type='search']")).sendKeys("java");
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File srcIMG = screen.getScreenshotAs(OutputType.FILE);
		String PATH = System.getProperty("USER.DIR") + "/SCREENSHOT/" +System.currentTimeMillis()+".PNG";
		FileUtils.copyFile(srcIMG, new File(PATH));
		
		
		//driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
		//driver.findElement(By.cssSelector("button.radius")).click();
		//driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in' or @type = 'submit']") ).click();
		//WebElement l = driver.findElement(By.xpath("//div[@id='flash-messages']"));
		//String act = l.getText();
		//System.out.println("error msg " + act);
		
	}
	
	

}
