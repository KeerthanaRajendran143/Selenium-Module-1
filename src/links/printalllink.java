package links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printalllink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		List<WebElement> url = driver.findElements(By.tagName("a"));
		for (WebElement el : url) {
			String link = el.getAttribute("href");
			System.out.println(link);
			
		}
	 driver.close();	
	}
	

}
