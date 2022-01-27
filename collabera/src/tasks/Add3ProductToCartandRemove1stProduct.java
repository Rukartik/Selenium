package tasks;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add3ProductToCartandRemove1stProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple iPhone XR (64GB) - (Product) RED")).click();

		String MainPageId = driver.getWindowHandle();
		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(MainPageId);

		for (String WindowId : AllWindowId) {
			driver.switchTo().window(WindowId);
			Thread.sleep(2000);
		}

		driver.findElement(By.id("submit.add-to-cart")).click();

		driver.findElement(By.id("attach-close_sideSheet-link")).click();
		Thread.sleep(1000);
		WebElement scrollup = driver.findElement(By.id("nav-search-submit-button"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0);", args);
		scrollup.click();
		
		

		//driver.findElement(By.id("nav-search-submit-button")).click();

		/*driver.findElement(By.linkText("Apple iPhone 11 (64GB) - Purple")).click();

		String FirstChild = driver.getWindowHandle();
		Set<String> AllWindowId1 = driver.getWindowHandles();
		AllWindowId1.remove(FirstChild);

		for (String WindowId1 : AllWindowId1) {
			driver.switchTo().window(WindowId1);
		}

		driver.findElement(By.id("productTitle")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("attach-close_sideSheet-link")).click();
		/*driver.findElement(By.id("nav-search-submit-button")).click();

		driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Pink")).click();

		String SecondChild = driver.getWindowHandle();
		Set<String> AllWindowId2 = driver.getWindowHandles();
		AllWindowId2.remove(SecondChild);
		AllWindowId2.remove(MainPageId);
		for (String WindowId2 : AllWindowId2) {
			driver.switchTo().window(WindowId2);
		}

		/*
		 * driver.findElement(By.id("add-to-cart-button")).click(); Thread.sleep(2000);
		 * driver.findElement(By.id("attach-close_sideSheet-link")); Thread.sleep(2000);
		 */
		// driver.findElement(By.id("nav-cart-count"));

	}

}
