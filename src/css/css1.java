package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
		// CSS ID SELECTOR
		driver.findElement(By.cssSelector("input#email")).sendKeys("Triotend@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#email")).clear();
	
		//CSS CLASS SELECTOR
		driver.findElement(By.cssSelector("input.form-password")).sendKeys("triotend");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.form-password")).clear();
		
		//CSS TAG AND ATTRIBUTE SELECTOR
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Triotend@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).clear();
		
		//CSS CLASS AND ATTRIBUTE SELECTOR
		driver.findElement(By.cssSelector("input.form-password[name='password']")).sendKeys("triotend");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.form-password[name='password']")).clear();
		
		//CSS STARTS WITH (^)
		driver.findElement(By.cssSelector("input[name^='us']")).sendKeys("Triotend@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name^='us']")).clear();
		
		//CSS ENDS WITH ($)
		driver.findElement(By.cssSelector("input[name$='rd']")).sendKeys("triotend");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name$='rd']")).clear();
		
		//CSS CONTAINS (*)
		driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("Triotend@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("triotend");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='btn']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
