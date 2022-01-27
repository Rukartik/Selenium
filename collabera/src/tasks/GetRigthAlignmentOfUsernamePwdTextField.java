package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRigthAlignmentOfUsernamePwdTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		Rectangle UsernameTextField = driver.findElement(By.id("email")).getRect();
		int UsernameTextFieldHeigth = UsernameTextField.getHeight();
		int UsernameTextFieldWidth = UsernameTextField.getHeight();
		int UsernameTextFieldXPos = UsernameTextField.getX();
		int UsernameTextFieldYPos = UsernameTextField.getY();

		System.out.println("Heigth = " + UsernameTextFieldHeigth);
		System.out.println("Width = " + UsernameTextFieldWidth);
		System.out.println("X Pos = " + UsernameTextFieldXPos);
		System.out.println("Y Pos = " + UsernameTextFieldYPos);

		Rectangle Pwd = driver.findElement(By.id("passContainer")).getRect();
		int PwdHeight = Pwd.getHeight();
		int PwdWidth = Pwd.getWidth();
		int PwdXPos = Pwd.getX();
		int PwdYPos = Pwd.getY();

		System.out.println();

		System.out.println("Heigth = " + PwdHeight);
		System.out.println("Width = " + PwdWidth);
		System.out.println("XPos = " + PwdXPos);
		System.out.println("YPos = " + PwdYPos);

	}

}
