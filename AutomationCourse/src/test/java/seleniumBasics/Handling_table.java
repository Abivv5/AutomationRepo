package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Handling_table extends Base {
	public void handlingTable() {
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement showmore = driver.findElement(By.xpath("//a[@id='showMoreLess']"));
		showmore.click();
		WebElement table = driver.findElement(By.xpath("//table[@id='dataTable']"));
		System.out.println(table.getText()); //to get the entire data from the table.
		WebElement tableRow =driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]")); //webelement creation for getting single row data 
		System.out.println(tableRow.getText());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handling_table table = new Handling_table();
		table.initializeBrowser();
		table.handlingTable();
		//table.closeandQuit();
	}

}
