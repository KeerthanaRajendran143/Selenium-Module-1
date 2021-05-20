package errormessage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class errormessage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		String u_error =driver.findElement(By.xpath("//p[contains(text(),'Username field is required')]")).getText();
		System.out.println(u_error);
		String p_error = driver.findElement(By.xpath("//p[contains(text(),'Password field is required')]")).getText();
		System.out.println(p_error);
		driver.close();

	}

}
