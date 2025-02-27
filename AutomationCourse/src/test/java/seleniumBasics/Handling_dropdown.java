package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Handling_dropdown extends Base {

	public void handlingDropdowns() {
		driver.navigate().to(" https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
		Select select = new Select(dropDown1); //Select It's a predefined class.
		select.selectByIndex(1);
		
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		Select select1 =new Select(dropDown2);
		select1.selectByValue("testng");
		
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
		Select select2 =new Select(dropDown3);
		select2.selectByVisibleText("JavaScript");
		

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handling_dropdown dropdown = new Handling_dropdown();
		dropdown.initializeBrowser();
		dropdown.handlingDropdowns();
		//dropdown.closeandQuit();
	}

}
