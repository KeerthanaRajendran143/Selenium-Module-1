package multiplewindow;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class arraymultiplewindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window ID is"+""+parent);
		Thread.sleep(1000);
		Set<String>s1 = driver.getWindowHandles();
		ArrayList<String>tabs=new ArrayList(s1);
		driver.switchTo().window(tabs.get(1));
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(2));
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(3));
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(0));
		driver.close();
		System.out.println("Current window ID is"+""+parent);
	}

}
