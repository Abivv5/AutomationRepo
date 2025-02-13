package seleniumBasics;


public class BrowserCommands extends Base {
	
	public void browserCommands() {
		String url= driver.getCurrentUrl(); //"getCurrentUrl();" this method is used for get the url.
		System.out.println(url);
		String title= driver.getTitle();
		System.out.println(title); //this method is used to get the title of the web application.
		String handleid =driver.getWindowHandle();
		System.out.println(handleid); //this method is used to get the window handle id.
		String pagesourse= driver.getPageSource();
		System.out.println(pagesourse);
	}
	public void navigationCommands() {
		driver.navigate().to("https://www.flipkart.com/"); //
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.navigationCommands();
		
		//browsercommands.browserCommands();
		//browsercommands.closeandQuit();
		
	}

}
