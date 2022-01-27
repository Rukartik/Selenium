package webDriversMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
	
		
		for(String WindowId : allWindowIds) {
			driver.switchTo().window(WindowId);
			driver.close();
		}
	}
}
