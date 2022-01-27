package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementUsingPartialLink {

	public static void main(String[] args) {
		System.setProperty("webdrive.chrome.driver", "./driver/chrome.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	}

}
