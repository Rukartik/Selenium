package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\karti\\Dropbox\\MyPC\\Desktop\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();

	}

}
