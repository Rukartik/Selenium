package tasks;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddProductAfterComparingThePrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		/*WebElement samsung = driver.findElement(By.id("twotabsearchtextbox"));
		samsung.sendKeys("samsung keypads mobiles", Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()=\"Samsung Guru 1200 (GT-E1200, Black)\"]")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		childWindow.remove(parentWindow);
		for(String window : childWindow) {
			driver.switchTo().window(window);
			Thread.sleep(2000);
		}*/
		
		WebElement samsung = driver.findElement(By.id("twotabsearchtextbox"));
		samsung.sendKeys("samsung mobiles", Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()=\"Samsung Galaxy S21 FE 5G (White, 8GB, 128GB Storage)\"]")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		childWindow.remove(parentWindow);
		for(String window : childWindow) {
			driver.switchTo().window(window);
			Thread.sleep(2000);
		}
		
	}

}
