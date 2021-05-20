package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(5000);
		
		Alert al= driver.switchTo().alert();
		String print = al.getText();
		System.out.println(print);
		al.accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(5000);
		Alert ale= driver.switchTo().alert();
		al.dismiss();
		driver.close();
		

	}

}
