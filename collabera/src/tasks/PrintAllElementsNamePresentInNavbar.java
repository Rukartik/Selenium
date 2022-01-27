package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllElementsNamePresentInNavbar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

		List<WebElement> navbar = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		for (WebElement ele : navbar) {
			System.out.println(ele.getText());
		}

	}

}
