package webelementlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
		//Locating Based on ID
		driver.findElement(By.id("email")).sendKeys("Triotend");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
		
		//Locating Based on CLASSNAME
		driver.findElement(By.className("btn")).click();
		Thread.sleep(1000);
		
		//Locating Based on TAG NAME
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Admin")).click();
		Thread.sleep(1000);
		
		// Locating Based on NAME
		driver.findElement(By.name("username")).sendKeys("Triotend@gmail.com");
		Thread.sleep(1000);
		
		//Locating Based on LINK TEXT (2 types : Linktext & Partial Link Test )
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Admin")).click();
		Thread.sleep(1000);
		
		// Locating Based on CSS SELECTOR
		driver.findElement(By.cssSelector("#email")).sendKeys("Triotend@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#email")).clear();
		Thread.sleep(1000);
		
		//Locating Based on RELATIVE X-PATH
		driver.findElement(By.xpath("//*[@id=\'email\'] ")).sendKeys("Triotend@gmail.com");
		Thread.sleep(1000);
		
		//Locating Based on ABSOLUTE X-PATH
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("triotend");
		Thread.sleep(1000);
		driver.findElement(By.className("btn")).click();
		Thread.sleep(1000);
		}
}
