package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://erp.triotend.com/");
		
		//TYPE CASTING WEBDRIVER to JAVASCRIPTEXECUTOR
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//code to login using javascript executor		
		js.executeScript("document.getElementById('user_email').value='tester'");
		js.executeScript("document.getElementById('password').value='test'");
		js.executeScript("document.getElementById('login_button').click();");
		//driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		Thread.sleep(15000);
		
		//TO CLICK ON THE HIDDEN ELEMENT
		WebElement el = driver.findElement(By.cssSelector("#menu > li:nth-child(5) > ul > li:nth-child(5) > a "));
		js.executeScript("arguments[0].click();",el);
		Thread.sleep(1000);
		
		//To navigate to a different page
		js.executeScript("window.location ='http://erp.triotend.com/salesinvoice.php';");
		
		//Vertical scroll - down by 500  pixels
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		
		
		//for scrolling till the element  of the page 
	   WebElement txt=driver.findElement(By.id("amountPaid"));
	   js.executeScript("arguments[0].scrollIntoView(true)",txt);
	   Thread.sleep(7000);
	   
	   // for scrolling till the bottom of the page 
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	
	   
	   
	   // for highliting webElement
	   WebElement hilight=driver.findElement(By.xpath("//h2[contains(text(),'Notes:')]"));
	   js.executeScript("arguments[0].setAttribute('style', 'background: skyblue ; border: 5px  solid brown;');",hilight);
	}

}
