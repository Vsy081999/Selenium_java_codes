package Selenium_Advance_Codes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Slider {

	public static void main(String[] args) {
		
		        // Set up WebDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to a page with a slider
		        driver.get("https://jqueryui.com/slider/");

		        // Switch to the frame containing the slider (if applicable)
		        driver.switchTo().frame(0);

		        // Locate the slider handle
		       
		        WebElement slider = driver.findElement(By.id("slider"));
		        
		        // Use Actions to move the slider
		        Actions actions = new Actions(driver);
		       /* actions.clickAndHold(slider)
		               .moveByOffset(50, 0) // Drag 50 pixels horizontally
		               .release()
		               .perform();
*/

		        actions.dragAndDropBy(slider,100,0)
	              // .moveByOffset(50, 0) // Drag 50 pixels horizontally
	               //.release()
	               .perform();

		        
		        
		        
		        
		        
		        
		        
		        
		        // Close the browser
		        //driver.quit();
		    }
		

	}


