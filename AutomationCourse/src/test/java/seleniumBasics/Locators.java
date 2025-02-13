package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void handlingLocators() {
		WebElement showMessageButton = driver.findElement(By.id("button-one")); //creating web element and locating the ID
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("btn btn-primary")); //locating by class
		driver.findElement(By.name("viewport")); //locating by name.
		driver.findElement(By.tagName("button")); //locating by tag.
		driver.findElement(By.linkText("Simple Form Demo")); //locating by using linktext.
		driver.findElement(By.partialLinkText("Simple")); 
		driver.findElement(By.cssSelector("button[id='button-one']")); //locating elements by using attibute and value.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.handlingLocators();
		
		locator.closeandQuit();
		
	}

}
