package codes_lucky_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class openbrowser {

;	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lucky\\eclipse-workspace\\API_Automation\\exe.files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		System.out.println("website launched");

	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lucky\\eclipse-workspace\\Codes\\exe.file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lucky\\\\eclipse-workspace\\\\Codes\\\\exe.file\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl())
*/

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lucky\\eclipse-workspace\\Codes\\exe.file\\chromedriver.exe");
	// line 1	
	WebDriver driver = new ChromeDriver();
	// line 2
	Thread.sleep(2000);
	// line 3
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
	
	
	
	//driver.get("https://www.facebook.com/");
	
	/*
	 * WebElement wb = driver.findElement(By.id("password"));
	 * 
	 * JavascriptExecutor js=(JavascriptExecutor)driver;
	 * 
	 * js.executeAsyncScript("argument[0].SrollIntoView(true);", wb);
	 * js.executeAsyncScript("window.scrollBy(0,1000)");
	 * 
	 */ 	
	
	
	
}}
