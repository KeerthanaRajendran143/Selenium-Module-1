package webdriverscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webdriverscreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/ecom/my-account-2/");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(1000);
		
		File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File ("E:\\Automation\\ss\\"+System.currentTimeMillis()+".png");
		FileHandler.copy(ss, destination);
		
	}

}
