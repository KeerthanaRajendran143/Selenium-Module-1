package multipleselect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		WebElement ms = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(ms);
		WebElement drp = driver.findElement(By.xpath("//select[@name='cars']"));
		Select mdrp = new Select(drp);
		mdrp.selectByIndex(0);
		Thread.sleep(1000);
		mdrp.selectByValue("opel");
		Thread.sleep(1000);
		mdrp.selectByVisibleText("Saab");
		Thread.sleep(1000);
		driver.close();
	}

}
