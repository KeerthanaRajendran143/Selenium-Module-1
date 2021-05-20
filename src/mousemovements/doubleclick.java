package mousemovements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/ecom/");
		
		//Maximize the browser
	     driver.manage().window().maximize();
		
		Actions action = new Actions (driver);
		WebElement el = driver.findElement(By.cssSelector("div.astra-shop-thumbnail-wrap>span.onsale "));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",el);
		action.doubleClick(el).build().perform();
		Thread.sleep(2000);
		
		driver.close();

	}

}
