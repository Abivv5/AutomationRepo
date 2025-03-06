package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_annotations {
	@Test    //represents the test case
	public void testCase1() {
		System.out.println("Test Case");	
	}
	@BeforeMethod      //this will run frst period of the program eg: initializing the browser type 
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod  //this will run last period of the program eg: close and quit.
	public void afterMethod() {
		System.out.println("After Method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
