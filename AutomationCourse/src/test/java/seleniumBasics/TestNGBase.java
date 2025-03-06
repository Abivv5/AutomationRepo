package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver;  
@BeforeMethod
	public void initializeBrowser() {
		driver = new ChromeDriver(); 
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		driver.get(" https://www.saucedemo.com/"); 
		driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
	}
@AfterMethod
public void closeandQuit() {
	//driver.close 
	//driver.quit();
}
} 
