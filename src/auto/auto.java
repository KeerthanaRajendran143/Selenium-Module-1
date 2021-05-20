package auto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("you");
		Thread.sleep(1000);

		List<WebElement>auto=driver.findElements(By.cssSelector("ul.erkvQe>li"));
		 for (WebElement webElement : auto) 
         {
			 if(webElement.getText().contains("youtube"))
        	 {
        		 webElement.click();
        		 break;
               }
			 
				 
	     }
		 driver.quit();
		

	}

}
