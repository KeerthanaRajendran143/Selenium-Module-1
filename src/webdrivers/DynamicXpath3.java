package webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		//X-path based on LAST
		driver.findElement(By.xpath("(//*[@type='text'])[last()]")).sendKeys("Rajendran");
		Thread.sleep(500);
		
		//X-path based on LAST -1
		driver.findElement(By.xpath("(//*[@type='text'])[last()-1]")).sendKeys("Keerthana");
		Thread.sleep(500);
		
		//X-path based on POSITION
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).clear();
		Thread.sleep(500);
		
		//X-path based on INDEX
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("Rajendran");
		
	}

}
