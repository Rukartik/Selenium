package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataPropertyFile {

	public static void main(String[] args) throws IOException {

		/*
		 * FileInputStream fis = new
		 * FileInputStream("./testResources/propertyFile/testData.properties");
		 * 
		 * Properties properties = new Properties(); //basic how to read data from file
		 * using property file.
		 * 
		 * properties.load(fis); System.out.println(properties.getProperty("username"));
		 */

		FileInputStream fis = new FileInputStream("./testResources/propertyFile/testData.properties");
		Properties properties = new Properties();
		properties.load(fis);

		System.setProperty(properties.getProperty("driverKey"), properties.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get(properties.getProperty("url"));

	}
}
