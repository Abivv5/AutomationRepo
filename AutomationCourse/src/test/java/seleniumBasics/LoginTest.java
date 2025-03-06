package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidCredentials() {
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login =driver.findElement(By.id("login-button"));
		login.click();
	}
	@Test
	public void verifyUserLoginWithValidUsernameAndInvalidPassword() {
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret");
		WebElement login =driver.findElement(By.id("login-button"));
		login.click();
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndValidPassword() {
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("stand");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login =driver.findElement(By.id("login-button"));
		login.click();
	}
	@Test
	public void verifyUserLoginWithInvalidUsernameAndInvalidPassword() {
		WebElement usernameField = driver.findElement(By.id("user-name"));
		usernameField.sendKeys("stand");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret");
		WebElement login =driver.findElement(By.id("login-button"));
		login.click();
	
		
	}
}
