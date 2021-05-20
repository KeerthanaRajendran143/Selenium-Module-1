package Tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bootstraptooltip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_tooltip.asp");
		WebElement cart=driver.findElement(By.xpath("//button[contains(text(),'Hover over me')]"));
		 Actions action=new Actions(driver);	
		 Thread.sleep(1000);
		 action.moveToElement(cart).build().perform();
		 String tooltip_msg=driver.findElement(By.className("tooltip")).getText();
		System.out.println(tooltip_msg);
	}

}
