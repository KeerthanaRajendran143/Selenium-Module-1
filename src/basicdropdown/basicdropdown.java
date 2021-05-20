package basicdropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basicdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Triotend@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("triotend");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(4000);
  		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[1]/a/span")).click();
		driver.findElement(By.linkText("Add Appointment")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement sdrp = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]/select[1]"));
		Select drp = new Select (sdrp);
		drp.selectByIndex(2);
		driver.close();
	}
	
}
