package assignment1;

import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentWindowId {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		String window = driver.getWindowHandle();
		System.out.println("The window id is : " + window);
		Thread.sleep(1000);
		driver.quit();

	}

}
