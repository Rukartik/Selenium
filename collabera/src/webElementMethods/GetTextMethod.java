package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		String ExpectedHead = "Please identify yourself";
		String ExpectedAdmin = "Administrator:";
		String ExpectedUser = "Regular User:";

		String ActualHead = driver.findElement(By.id("headerContainer")).getText();
		String ActualAdmin = driver.findElement(By.id("adminCredentialsHeader")).getText();
		String ActualUser = driver.findElement(By.id("userCredentialsHeader")).getText();
		
		if((ExpectedHead.equals(ActualHead)) && (ExpectedAdmin.equals(ActualAdmin)) && (ExpectedUser.equals(ActualUser))) {
			System.out.println("Error Message is properly displayed");
		}
		else
			System.out.println("Error Message is not properly displayed");
		
		/*
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.linkText("X")).click();
		driver.findElement(By.linkText("SIGN IN")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("X")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

		String ExpectedUsernameErrorMessage = "Email Field Is Required";
		String ExpectedPasswordErrorMessage = "Password Field Is Required";

		String ActualUsernameErrorMessage = driver.findElement(By.id("email-error")).getText();
		String ActualPasswordErrorMessage = driver.findElement(By.id("password-error")).getText();

		if ((ExpectedUsernameErrorMessage.equals(ActualUsernameErrorMessage)) && (ExpectedPasswordErrorMessage.equals(ActualPasswordErrorMessage))) {
			System.out.println("Valid ErrorMessage");
		} else
			System.out.println("Invalid ErrorMessage");

		  */

	}

}
