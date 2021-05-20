package Tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltiptext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/ecom/");
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='ast-site-header-cart']"));
		Actions action = new Actions (driver);
		Thread.sleep(1000);
		action.moveToElement(cart).build().perform();
		Thread.sleep(3000);
		String tooltip_msg = driver.findElement(By.className("woocommerce-mini-cart__empty-message")).getText();
		System.out.println(tooltip_msg);

	}

}
