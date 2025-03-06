package seleniumBasics;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Handling_checkbox extends Base {
	public void handling_Checkbox() {
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement firstbox = driver.findElement(By.xpath("//input[@value='option-1']"));
		 Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver) //fluent waiter
		 			.withTimeout(Duration.ofSeconds(10)) 
		 			.pollingEvery(Duration.ofSeconds(3)) 
		 			.ignoring(NoSuchElementException.class); 
		 			fluentWait.until(ExpectedConditions.elementToBeClickable(firstbox));
		firstbox.click();
	}
	public void handling_radiobutton() {
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton =driver.findElement(By.xpath("//input[@value='green']"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handling_checkbox checkbox = new Handling_checkbox();
		checkbox.initializeBrowser();
		//checkbox.handling_Checkbox();
		checkbox.handling_radiobutton();
		//checkbox.closeandQuit();
	}

}
