package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class listener {

	public static void main(String[] args) {
		
		System.out.println("Started");
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver event1 = new EventFiringWebDriver (driver);
		
		ActivityCapture handle = new ActivityCapture();
		
		event1.register(handle);
		driver = event1;
		
		driver.navigate().to("http://triotend.com/tts/site/login");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("triotend");
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		driver.quit();
		
		System.out.println("End");
		

	}

}
