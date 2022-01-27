package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qtpselenium.com/login");
		
		driver.findElement(By.id("eMailAddress")).sendKeys("ravipawar991@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userPassword")).sendKeys("sOnDyT8");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
