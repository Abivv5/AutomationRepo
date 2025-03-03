package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Multiple_window_handling extends Base {
	public void multipleWindowHandling() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		 String parent_window_handleid=driver.getWindowHandle(); 
	 		System.out.println("Parent window handle id is: "+parent_window_handleid);
		WebElement click = driver.findElement(By.xpath("//a[text()='Click Here']"));
		click.click();
		Set<String> handleids = driver.getWindowHandles();//to get multiple handle ID's. 
		System.out.println(handleids);
		 Iterator<String>values=handleids.iterator(); 
	 		while(values.hasNext()) //for switch process
	 		{ 
	 			String current_id=values.next(); 
	 			if(!current_id.equals(parent_window_handleid)) 
	 			{ 
	 				driver.switchTo().window(current_id); 
	 				WebElement email_fld=driver.findElement(By.xpath("//input[@name='emailid']")); 
	 				email_fld.sendKeys("aishu123@gmail.com"); 
	 				WebElement submit_fld=driver.findElement(By.xpath("//input[@name='btnLogin']")); 
	 				submit_fld.click(); 
	 				driver.switchTo().defaultContent(); 
	 			} 
	 		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple_window_handling window = new Multiple_window_handling();
		window.initializeBrowser();
		window.multipleWindowHandling();
		//window.closeandQuit();
	}

}
