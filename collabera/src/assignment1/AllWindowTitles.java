package assignment1;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AllWindowTitles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com/");

		Set<String> allWindows = driver.getWindowHandles();
		for (String handle : allWindows) {
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}
}
