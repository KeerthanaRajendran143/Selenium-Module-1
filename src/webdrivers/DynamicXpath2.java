package webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
		// X-Path based on CONTAINS
		driver.findElement(By.xpath("//*[contains(@id,'password')]")).sendKeys("triotend");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[contains(@id,'password')]")).clear();
		Thread.sleep(500);
		
		
		//X-path based on STARTS-WITH
		driver.findElement(By.xpath("//*[starts-with(@id,'ema')]")).sendKeys("Triotend@gmail.com");;
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[starts-with(@id,'ema')]")).clear();
		Thread.sleep(500);
		
		//X-path based on Using TEXT
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		Thread.sleep(500);
		
		//X-path based on FOLLOWING
		driver.findElement(By.xpath("//input[@id='email']/following ::input[@id='password']")).sendKeys("triotend");
		Thread.sleep(500);
		
		//X-path based on PRECEDING
		driver.findElement(By.xpath("//input[@id='password']/preceding ::input[@id='email']")).sendKeys("Triotend@gmail.com");
		Thread.sleep(500);
}
}