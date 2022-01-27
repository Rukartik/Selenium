package assignment1;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardBackRefresh {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");

		Thread.sleep(3000);

		driver.get("https://kartiknavgirer12.wixsite.com/mysite/");
		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
