package mousemovements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//CREATE AN OBJECT 'action' OF AN ACTION CLASS
		Actions action = new Actions (driver);
		WebElement rc = driver.findElement(By.cssSelector(".context-menu-one"));
		
		//contextClick() method to do right click on the element
		action.contextClick(rc).build().perform();
		Thread.sleep(2000);
		WebElement getcopytext = driver.findElement(By.cssSelector(".context-menu-icon-delete"));
		
		
		//getText() method to get the text value
		String gettext = getcopytext.getText();
		System.out.println(gettext);
		
		driver.close();
	}

}
