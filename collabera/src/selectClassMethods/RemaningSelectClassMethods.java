package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemaningSelectClassMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/karti/Dropbox/MyPC/Desktop/Selenium/dropDown.html");
		WebElement fruits = driver.findElement(By.id("m1"));
		
		Select selectfruits = new Select(fruits);
		selectfruits.selectByIndex(0);
		selectfruits.selectByIndex(2);
		selectfruits.selectByValue("6");
		selectfruits.selectByVisibleText("Orange");
		selectfruits.deselectByIndex(2);
		
		List<WebElement> optionsselected = selectfruits.getAllSelectedOptions();
		for(WebElement ele : optionsselected) {
			System.out.println(ele);
		}
		
		selectfruits.getFirstSelectedOption();
		
	}

}
