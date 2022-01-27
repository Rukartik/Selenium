package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConifrmationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://licindia.in/Home/Policy-Loan-Options#");
		
		driver.findElement(By.linkText("Pay Direct (Without login)")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		

	}

}
