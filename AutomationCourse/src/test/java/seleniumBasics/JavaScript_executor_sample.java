package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript_executor_sample extends Base{
	public void javaScript_ExecutorSample() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']")); 
		 	JavascriptExecutor js = (JavascriptExecutor)driver; //cast to driver because it's a interface v can't create direct obj
		 	js.executeScript("arguments[0].click();", showMessageButton); //"executeScript" it's a method of interface
		 	 js.executeScript("window.scrollBy(0,350)", ""); //for scroll down
		 	 js.executeScript("window.scrollBy(0,-350)", "");//- for scroll up
		 	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScript_executor_sample scroll =new JavaScript_executor_sample();
		scroll.initializeBrowser();
		scroll.javaScript_ExecutorSample();
		//scroll.closeandQuit();
	}

}
