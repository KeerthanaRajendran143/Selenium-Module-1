package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Jars\\geckodriver\\.geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

	}

}
