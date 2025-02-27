package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElement_Commands extends Base {
	public void webElements() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textElement = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		textElement.sendKeys("ABI");//sendkeys() method is used to write any messages in that msg box.
		/*WebElement message = driver.findElement(By.xpath("//input[@id='value-a']"));
		message.sendKeys("10");*/
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();//this method is used for click that button.
		System.out.println(showMessage.isEnabled());
		System.out.println(showMessage.isDisplayed());//to check the button is displayed or not 
		
		WebElement yourMessage =driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(yourMessage.getText());//for confirming the text.
		System.out.println(showMessage.getCssValue("background-color")); //to get the cssvalue of the function.
		textElement.clear();
		System.out.println(showMessage.getSize()); //to get the size of the button.
		System.out.println(showMessage.getTagName());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement_Commands webelement = new WebElement_Commands();
		webelement.initializeBrowser();
		webelement.webElements();
		//webelement.closeandQuit();
		
	}
}
