package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodsOfActionsClassUsingTrello {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		driver.get("https://trello.com/login");

		driver.findElement(By.id("user")).sendKeys("kartiknavgire.r12@gmail.com");
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Rukartik@12", Keys.ENTER);
		driver.findElement(By.id("login-submit")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class=\"board-tile-details is-badged\"]")).click();
		
		Actions actions = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//span[text()='Defect Life Cycle']"));
		WebElement dest = driver.findElement(By.xpath("//h2[text()='Manual']/../..//span[text()='Add a card']"));
		
		//actions.dragAndDrop(src, dest).perform();
		//actions.dragAndDropBy(src, 10,0).perform();
		
		actions.clickAndHold(src).moveByOffset(400, 200).perform();
		Thread.sleep(2000);
		actions.release().perform();
				
		driver.findElement(By.xpath("//a[contains(@class,\"quick-card-editor-buttons-item\")]"));
		
	}

}
