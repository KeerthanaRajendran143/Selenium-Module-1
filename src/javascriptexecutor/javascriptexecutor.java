package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		
		//TYPE CONVERSION OF DRIVER TO JS
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//TO TYPE TEXT IN TEXT BOX
		js.executeScript("document.getElementById('email').value='Triotend@gmail.com'");
		js.executeScript("document.getElementById('password').value='triotend'");
		
		//TO CLICK ON A BUTTON
		WebElement loginButton = driver.findElement(By.className("btn"));
		js.executeScript("arguments[0].click();",loginButton);
		Thread.sleep(2000);
		
		//TO GENERATE AN ALERT
		//js.executeScript("alert('Alert Genaration For Testing');");
		//Thread.sleep(1000);
		
		//TO REFRESH THE BROWSER
		js.executeScript("history.go(0)");
		
		//TO GET INNERTEXT OF THE ENTIRE WEBPAGE
		String text = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(text);
		
		//TO GET THE TITLE OF WEBPAGE
		String title =  js.executeScript("return document.title;").toString();
		System.out.println();
		System.out.println("WEBPAGE NAME : "+title);
		
		//TO GET THE DOMAIN
		String domain =  js.executeScript("return document.domain;").toString();
		System.out.println();
		System.out.println("DOMAIN NAME : "+domain);
		
		//TO GET THE URL
		String url =  js.executeScript("return document.URL;").toString();
		System.out.println();
		System.out.println("URL : " +url);
	}

}
