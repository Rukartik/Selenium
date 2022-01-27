package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleUrlPageSourceOfFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		System.out.println(driver.getPageSource());
		System.out.println();
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getCurrentUrl());
		

	}

}
