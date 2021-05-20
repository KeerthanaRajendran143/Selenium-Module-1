package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Triotend@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("button[class*='btn']")).click();
		Thread.sleep(2000);
		
		//DIRECT CHILD
		driver.findElement(By.cssSelector("ul.sidebar-menu>li")).click();
		Thread.sleep(2000);
		
		//SUB-CHILD
		driver.findElement(By.cssSelector("ul.sidebar-menu li:nth-of-type(10)")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul.sidebar-menu>li.treeview.active>ul>li:nth-child(2)>a")).click();
		
		//Nth-CHILD
		driver.findElement(By.cssSelector("ul.sidebar-menu li:nth-of-type(3)")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
