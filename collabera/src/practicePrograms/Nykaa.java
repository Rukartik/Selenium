package practicePrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(2000);

		String mainPageId = driver.getWindowHandle();
		driver.findElement(By.className("Offers_Hover")).click();
		Set<String> offerPageId = driver.getWindowHandles();
		offerPageId.remove(mainPageId);
		Thread.sleep(2000);

		for (String WindowId : offerPageId) {
			driver.switchTo().window(WindowId);
			System.out.println(WindowId);
		}
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type=\"search\"]")).sendKeys("Face Mask", Keys.ENTER);

	}

}
