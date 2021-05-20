package radiobtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootradio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=5.0_4");
		List<WebElement> br= driver.findElements(By.xpath("//input[contains(@id,'Radios1')]"));
		for (WebElement brt : br) {
			if ( brt.getAttribute("value").equals("Yes")) {
				brt.click();
			}
			Thread.sleep(1000);
			if(brt.getAttribute("value").equals("declater")) {
				brt.click();
			}
			Thread.sleep(1000);
			}
		driver.close();
			
		}

	}


