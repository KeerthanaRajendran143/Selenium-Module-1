package mousemovements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leftclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://treecutting.triotend.com/documents.php");
		
		WebElement el = driver.findElement(By.xpath("//input[@id='picture']"));
		Thread.sleep(2000);
		
		//MOUSE ACTION TO CLICK ON UPLOAD BUTTON
		Actions action = new Actions ( driver);
		action.click(el).build().perform();
		Thread.sleep(2000);
		
		

	}

}
