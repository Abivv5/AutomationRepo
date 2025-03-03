package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handling_Frames extends Base{
	public void handlingFrames() {
		driver.navigate().to(" https://demoqa.com/frames");
		List<WebElement> iframe=driver.findElements(By.tagName("iframe"));
		int iframeCount = iframe.size();
		System.out.println(iframeCount);
		WebElement pageOne = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(pageOne);
		WebElement sampleElement =driver.findElement(By.id("sampleHeading"));
		System.out.println(sampleElement.getText());
		driver.switchTo().defaultContent();//driver come to the previous page
		System.out.println(driver.getTitle());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handling_Frames frames = new Handling_Frames ();
		frames.initializeBrowser();
		frames.handlingFrames();
		
	}

}
