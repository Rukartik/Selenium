package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandSendKeysMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement username = driver.findElement(By.cssSelector("input[aria-required=\"true\"]"));
		username.clear();
				
		username.sendKeys("81473","26552");
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL+"a" );
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL+"c");
		
		WebElement pwd = driver.findElement(By.cssSelector("input[aria-label=\"Password\"]"));
		pwd.clear();
		Thread.sleep(2000);
		pwd.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"button\" and text()='Show' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"button\" and text()='Hide' ]")).click();
		
		
	}

}
