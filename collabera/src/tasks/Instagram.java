package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?next=%2Flogin%2F&source=desktop_nav");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[aria-required=\"true\"]")).sendKeys("8147326552");

	}

}
