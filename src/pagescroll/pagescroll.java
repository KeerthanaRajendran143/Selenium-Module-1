package pagescroll;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class pagescroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/");
		
		Actions action = new Actions (driver);
		Thread.sleep(1000);
		
		//SCROLL DOWN
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		
		//SCROLL UP
		action.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(1000);
		
		driver.close();
	}

}
