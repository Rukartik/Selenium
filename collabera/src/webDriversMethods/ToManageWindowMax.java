package webDriversMethods;

import org.openqa.selenium.edge.EdgeDriver;

public class ToManageWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");

		
		

	}

}
