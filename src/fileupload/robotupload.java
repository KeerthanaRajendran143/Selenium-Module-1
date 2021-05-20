package fileupload;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotupload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://treecutting.triotend.com/documents.php");
		Thread.sleep(1000);
		
		WebElement el = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		
		//mouse action to click on upload button
		Actions clk = new Actions(driver).click(el);
		clk.build().perform();
		
		//file Location to upload
		StringSelection sel = new StringSelection("E:\\Automation\\kp.pdf");
		
		//Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		
		//Create object of Robot class
		Robot robot = new Robot();
		Thread.sleep(1000);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//Press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		//Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		//Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		driver.close();
		
		}
	

}
