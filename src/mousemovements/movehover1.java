package mousemovements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movehover1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/ecom/");
		
		
		//Main Menu
        WebElement mainMenu = driver.findElement(By.cssSelector("ul.main-header-menu li:nth-of-type(1)"));
        WebElement subMenu = driver.findElement(By.cssSelector("ul.sub-menu li:nth-of-type(2)"));
        
        
        //Create object 'action' of an Actions class
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        
        
        //moving to the main menu and then sub menu and clicking on it using object of the Actions class
        action.moveToElement(mainMenu).moveToElement(subMenu).click().build().perform();
	}

}
