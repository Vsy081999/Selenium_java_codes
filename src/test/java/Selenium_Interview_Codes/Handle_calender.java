package Selenium_Interview_Codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_calender {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//
		

		// driver.get("https://seleniumpractise.blogspot.com/");

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));

		String monthYearval = driver.findElement(By.className("ui-datepicker-title")).getText();
		String month = monthYearval.split(" ")[0].trim();
		String year = monthYearval.split(" ")[1].trim();

		System.out.println("monthYearval  :" + monthYearval);

		while (!(month.equals("June") && year.equals("2024"))) {
			driver.findElement(By.xpath("//a[@title='Prev']")).click();
			monthYearval = driver.findElement(By.className("ui-datepicker-title")).getText();

			month = monthYearval.split(" ")[0].trim();
			year = monthYearval.split(" ")[1].trim();
		}
		driver.findElement(By.xpath("//a[text()='23']")).click();
	}
}
