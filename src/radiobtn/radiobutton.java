package radiobtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
