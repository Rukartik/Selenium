package webDriversMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com");
		System.out.println(driver.getCurrentUrl());

	}

}
