package mousemovements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement frm = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frm);
		
		//SOURCE LOCATOR
		WebElement source = driver.findElement(By.id("draggable"));
		
		//DESTINATION LOCATOR
		WebElement destination = driver.findElement(By.id("droppable"));
		
		//dragAndDrop(source, target) method accepts two parameters source and locator. 
		//used dragAndDrop method to drag and drop the source locator to target locator
		
		action.dragAndDrop(source, destination).build().perform();
	}
}
