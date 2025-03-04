package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class File_upload extends Base{
	public void fileUpload_sendkeys() {
		driver.navigate().to(" https://demo.guru99.com/test/upload/");
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("\"C:\\Users\\Abishika V V\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\ABISHIKA V V. RESUME..pdf\\");
		//this path from "copy as path" of the document.
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='terms']"));
		checkbox.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	public void fileUpload_robot() throws AWTException {
		driver.navigate().to(" https://www.ilovepdf.com/pdf_to_word");
		WebElement selectpdf = driver.findElement(By.id("pickfiles"));
		selectpdf.click();
		 StringSelection s = new StringSelection("\"C:\\Users\\Abishika V V\\git\\AutomationRepo\\AutomationCourse\\src\\test\\resources\\ABISHIKA V V. RESUME..pdf\\"); 
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 
			Robot robot = new Robot(); 
			robot.delay(3000);
		      //releasing enter 
		      robot.keyRelease(KeyEvent.VK_ENTER); 
		      robot.keyPress(KeyEvent.VK_CONTROL); 
		      robot.keyPress(KeyEvent.VK_V);
		      robot.keyRelease(KeyEvent.VK_CONTROL); 
 		      robot.keyRelease(KeyEvent.VK_V); 
 		      robot.keyPress(KeyEvent.VK_ENTER); 
 		      robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File_upload file = new File_upload();
		file.initializeBrowser();
		//file.fileUpload_sendkeys();
		try {
			file.fileUpload_robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//file.closeandQuit();
	}
}
//this program for uploading one file (it can be any type pdf,word doc) to the application. 
// here we should usesrc/test/resources only. 2 ways to achieve 1 is by using sendkeys 2. robot class
