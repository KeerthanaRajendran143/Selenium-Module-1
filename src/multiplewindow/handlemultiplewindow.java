package multiplewindow;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlemultiplewindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		Set<String>s1 = driver.getWindowHandles();
		System.out.println("Total windows opened are"+""+s1.size());
		for (String child : s1) {
			if(!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.close();
				Thread.sleep(1000);
			}
			
		}
		driver.switchTo().window(parent);
		driver.close();
	}

}
