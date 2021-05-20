package mousemovements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/ecom/");
		WebElement mainmenu = driver.findElement(By.cssSelector("ul.main-header-menu li:nth-of-type(1)"));
		Actions action = new Actions(driver);
		
		//TO MOUSEOVER ON MAINMENU
		action.moveToElement(mainmenu).build().perform();
		Thread.sleep(2000);
		
		//SUBMENU
		WebElement submenu = driver.findElement(By.cssSelector("ul.sub-menu li:nth-of-type(2)"));
		
		//TO MOUSEOVER ON SUBMENU
		action.moveToElement(submenu).click().build().perform();
		Thread.sleep(1000);
		
		//TO CLOSE THE DRIVER
		driver.close();

	}

}
