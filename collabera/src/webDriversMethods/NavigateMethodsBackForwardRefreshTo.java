package webDriversMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsBackForwardRefreshTo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		
		Thread.sleep(3000);
		
		driver.get("https://github.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
		URL url = new URL("https://kartiknavgirer12.wixsite.com/mysite");
		driver.navigate().to(url);
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://kartiknavgirer12.wixsite.com/mysite/resume");
		
		
		
	}

}
