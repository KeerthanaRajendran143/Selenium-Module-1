package calendars;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class application {

	public static void main(String[] args) {
		System.out.println("START");
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		//Script to login
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("triotend@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("triotend");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		//Script to click on the front office menu
		WebElement frontoffice=driver.findElement(By.cssSelector("ul.sidebar-menu>li"));
		wait.until(ExpectedConditions.elementToBeClickable(frontoffice));
		frontoffice.click();
		
		//script to click on the visitor book
		WebElement visitorbook=driver.findElement(By.cssSelector("div.box-tools>a:nth-of-type(2)"));
		wait.until(ExpectedConditions.elementToBeClickable(visitorbook));
		visitorbook.click();

		//script to click on the Add visitor
		WebElement addvistior=driver.findElement(By.cssSelector("div.box-tools>a"));
		wait.until(ExpectedConditions.elementToBeClickable(addvistior));
		addvistior.click();
		
		//script to click on the date picker
		WebElement datepicker=driver.findElement(By.cssSelector("#date"));
		wait.until(ExpectedConditions.elementToBeClickable(datepicker));
		datepicker.click();
		
		//calling date picker function to click the date
		datepicker1 d=new datepicker1();
		d.datpicker(driver, "7",07,2021);
		
		
		driver.quit();
		System.out.println("END");
	}

}
