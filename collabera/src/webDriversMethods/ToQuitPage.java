package webDriversMethods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToQuitPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://github.com/");
		driver.quit();
	}
}
