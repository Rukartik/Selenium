package webDriversMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kartiknavgirer12.wixsite.com/mysite");
		
		//String windowId = driver.getWindowHandle(); We can do in both way!!
		//System.out.println(windowId);
		
		System.out.println(driver.getWindowHandle());
		

	}

}
