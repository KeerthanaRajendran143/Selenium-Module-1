package links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://triotend.com/ecom");
		
		List<WebElement> url = driver.findElements(By.tagName("a"));
		for (WebElement el : url) {
			String crul = el.getAttribute("href");
			verifyLinkActive(crul);
			String brl = "http://triotend.com/ec";
			verifyLinkActive(brl);
					
		}

	}

	private static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL (linkUrl);
			
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			
				System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
		}
			catch (Exception e) {
			
		}
		
	}
}


