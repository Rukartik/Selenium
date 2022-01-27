package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountandPrintAutoSugesstion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com/");
		//Thread.sleep(2000);
		driver.findElement(By.name("q")).click();
		List<WebElement> LOS = driver.findElements(By.xpath("//li[@role=\"presentation\" and not(@id)] "));
		List<WebElement> DOS = driver.findElements(By.xpath("//li[@role=\"presentation\" and not(@id)] "));
		System.out.println("The number of suggestion present are: " +LOS.size());
		
		for(WebElement ele : DOS) {
			System.out.println(ele.getText());
		}
		
		
		
	}

}
