package webDriversMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToSetSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		
		Dimension dimension = driver.manage().window().getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("Before increasing the height & width");
		System.out.println("Heigth: "+ height +" width:"+width);
		
		Thread.sleep(2000);
		
		Dimension dimension1 = new Dimension(1212,1412);
		driver.manage().window().setSize(dimension1);
		
		int height1 = dimension1.getHeight();
		int width1 = dimension1.getWidth();
		System.out.println("\nAfter increasing the height & width");
		System.out.println("Heigth: "+ height1 +" width:"+width1);
		

	}

}
