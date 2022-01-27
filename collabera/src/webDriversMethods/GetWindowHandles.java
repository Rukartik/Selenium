package webDriversMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kartiknavgirer12.wixsite.com/mysite");
		Thread.sleep(2000);
		driver.get("https://google.com/");
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds) {
			System.out.println(windowId);
		}
	}

}
