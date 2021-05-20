package bootdrp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootdrp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'multiselect')]")).click();
		List<WebElement> drp = driver.findElements(By.cssSelector("ul.multiselect-container.dropdown-menu>li>a"));
		for (WebElement a : drp) {
			if(a.getText().equals("HTML")) {
				a.click();
			}
			Thread.sleep(1000);
			if(a.getText().equals("Bootstrap Tips")) {
				a.click();
			}
			Thread.sleep(1000);
			if(a.getText().equals("CSS tricks")) {
				a.click();
			}
			Thread.sleep(1000);
			
		}
		driver.close();
	}

}
