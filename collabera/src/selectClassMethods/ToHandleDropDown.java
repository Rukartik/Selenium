package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select dayselect = new Select(day); 
		System.out.println(dayselect.isMultiple());	//just return boolean (single/multiple select dropdown)
		dayselect.selectByIndex(24);
		
		//List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']/option"));
		//for(WebElement ele : monthList) {
		//System.out.println(ele.getText());	//to print all the months using normal web elements methods
		//}
		
		Select monthselect = new Select(month);
		System.out.println(monthselect.isMultiple());
		monthselect.selectByValue("10");
		
		
		Select yearselect = new Select(year);
		System.out.println(yearselect.isMultiple());
		yearselect.selectByVisibleText("1997");

	}

}
