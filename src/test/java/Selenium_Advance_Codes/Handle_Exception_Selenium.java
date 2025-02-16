package Selenium_Advance_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Exception_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
//		driver.findElement(By.name("a")).sendKeys("abcd");
		try {

			driver.findElement(By.name("a")).sendKeys("abcd");
		}
		catch(NoSuchElementException e) {
			System.out.println("not found" +" "+ "NoSuchElementException");
		}

	}
}
