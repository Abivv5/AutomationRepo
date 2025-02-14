package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver; //to initialize gloabally 

	public void initializeBrowser() {
		driver = new ChromeDriver(); //no need to write Webdriver driver = new ChromeDriver(); 
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		driver.get(" https://selenium.qabible.in/"); //url up,to launch the web application, get is a method 
		driver.manage().window().maximize(); //to maximize the screen code	
		
	}
public void closeandQuit() {
	//driver.close - it helps to close a single web page
	driver.quit(); //In quit this command helps to close all the related web page.
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.initializeBrowser();
	}

}
