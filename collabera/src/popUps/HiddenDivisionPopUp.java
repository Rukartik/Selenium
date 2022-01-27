package popUps;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopUp {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		String month = ldt.getMonth().name();
		month = month.substring(0, 1).toUpperCase() + month.substring(1, month.length()).toLowerCase();
		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.booking.com/");

		driver.findElement(By.xpath("//div[@data-mode=\"checkin\"]")).click();

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/..//span[text()='"+date+"']")).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//div[@data-bui-ref=\"calendar-next\"]")).click();
			}
		}
		Actions actions = new Actions(driver);
		actions.click().perform();

	}

}
