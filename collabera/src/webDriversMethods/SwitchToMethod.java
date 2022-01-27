package webDriversMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(2000);
	
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedWindowTitle = "ICICI";
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualWindowTitle = driver.getTitle();
			if(expectedWindowTitle.equals(actualWindowTitle)){
				driver.manage().window().maximize();
				break;
				
			}
		}
	}

}
