package popUps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/");

		driver.findElement(By.xpath("//h3[text()='PDF to Word']")).click();
		
		driver.findElement(By.linkText("Select PDF file")).click();
		
		Runtime.getRuntime().exec("./autoIt/FileiploadPopUp.exe");
	}

}
