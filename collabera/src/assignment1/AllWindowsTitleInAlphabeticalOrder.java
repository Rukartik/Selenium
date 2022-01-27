package assignment1;

import java.util.TreeSet;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AllWindowsTitleInAlphabeticalOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver = new  FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com/");
		
		TreeSet<String> allWindows = (TreeSet<String>) driver.getWindowHandles();
        for(String handle : allWindows) {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }
        
        
        
        /*HashSet<String> allWindows = (HashSet<String>) driver.getWindowHandles();
        for(String handle : allWindows) {
            driver.switchTo().window(handle);
            System.out.println(driver.getTitle());
        }*/
		
        driver.quit();
	}

}
