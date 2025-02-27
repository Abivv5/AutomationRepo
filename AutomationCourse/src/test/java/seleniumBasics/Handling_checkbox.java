package seleniumBasics;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handling_checkbox extends Base {
	public void handling_Checkbox() {
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//WebElement firstbox = driver.findElement(By.xpath("//input[@value='option-1']"));
		//firstbox.click();
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
