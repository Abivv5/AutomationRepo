package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alert_handling extends Base{
	public void handling_Simple_Alert() {
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement simple = driver.findElement(By.xpath("//button[@id='alertButton']"));
		simple.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void handling_confirm_alert() {
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirm.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
	public void handling_Prompt_alert() {
		driver.navigate().to(" https://demoqa.com/alerts");
		WebElement prompt = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		prompt.click();
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("Abi");
		alert.accept();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alert_handling alert1 = new Alert_handling();
		alert1.initializeBrowser();
		//alert1.handling_Simple_Alert();
		//alert1.handling_confirm_alert();
		alert1.handling_Prompt_alert();

	}

}
