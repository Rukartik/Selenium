package basics;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingEdgeBrowser 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();

	}

}

