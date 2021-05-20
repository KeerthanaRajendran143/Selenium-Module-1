package webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
		//X-path based on Double slash (RELATIVE X_PATH )
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Trio@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(1000);
		
		//X-path based on Single Attribute
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Triotend@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		Thread.sleep(1000);
		
		//X-path based on Multiple Attribute [ * refer WITHOUT TAG NAME ]
		driver.findElement(By.xpath("//*[@id='email'][@placeholder='Username']")).sendKeys("Trio@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email'][@placeholder='Username']")).clear();
		Thread.sleep(1000);
		
		//X-path based on AND Multiple Attribute
		driver.findElement(By.xpath("//*[@id='email' and @placeholder='Username']")).sendKeys("Triotend@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='email' and @placeholder='Username']")).clear();
		Thread.sleep(1000);
		
		//X-path based on OR Multiple Attribute
		driver.findElement(By.xpath("//*[@id='email' or @placeholder='Password']")).sendKeys("Trio@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='email' or @placeholder='Password']")).clear();
		Thread.sleep(1000);
	}

}
