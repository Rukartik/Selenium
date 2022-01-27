package webDriversMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToClosePage {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.close();
		
		
		
	}

}
