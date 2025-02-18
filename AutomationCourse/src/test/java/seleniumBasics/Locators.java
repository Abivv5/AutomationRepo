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
		driver.findElement(By.xpath("//button[@id='button-one']")); //locating elements by using xpath method here we used one syntax //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@id='single-input-field']")); //example 2
		driver.findElement(By.xpath("//button[@fdprocessedid='vo77of']")); //example 3
		driver.findElement(By.xpath("//button[text()='Show Message']")); //without attribute finding xpath 
		driver.findElement(By.xpath("//button[starts-with(text(),'Show')]")); //for partial text msg locating xpath.
		driver.findElement(By.xpath("//button[@id='button-one' and@type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or@id='button-one-electronics']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath(" //div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath(" //button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath(" //button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath(" //button[@id='button-one']//ancestor::div"));
	    driver.findElement(By.xpath(" //div[@class='card']//descendant::div"));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locator = new Locators();
		locator.initializeBrowser();
		locator.handlingLocators();
		
		locator.closeandQuit();
		 
	}

}

