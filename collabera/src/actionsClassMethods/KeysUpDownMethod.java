package actionsClassMethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysUpDownMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// WebDriverWait explicitWait = new WebDriverWait(driver, 10);
		driver.get("https://www.myntra.com/");

		String ExpTitle = "Home and Living - Buy Interior Decoration Products and Accessories Online in India";

		List<WebElement> navBar = driver.findElements(By.xpath("//a[@data-type=\"navElements\"]"));
		Actions actions = new Actions(driver);

		for (WebElement ele : navBar) {
			actions.keyDown(Keys.CONTROL).click(ele).perform();
			actions.keyUp(Keys.CONTROL).perform();
		}

		//String parentId = driver.getWindowHandle();
		Set<String> childIds = driver.getWindowHandles();
		//childIds.remove(parentId);

		for (String WinIds : childIds) {
			driver.switchTo().window(WinIds);

			String actualWindowTitle = driver.getTitle();
			if (actualWindowTitle.equals(ExpTitle)) {
				driver.close();
				break;
			}
		}
	}

}
