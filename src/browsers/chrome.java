package browsers;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//opening URL using get method
		driver.get("http://triotend.com");
				
		//opening URL using navigate method
		driver.navigate().to("http://triotend.com/tts/site/login");
		
		//Navigating BACKWARD in a browser
		driver.navigate().back();
		
		//Navigating FORWARD in a browser
		driver.navigate().forward();
		
		//Navigating REFRESH in a browser
		driver.navigate().refresh();
		
		//Clicking on WebElements
		driver.findElement(By.className("btn")).click();
		
		
		//Writing TEXT in TEXTBOX
		driver.findElement(By.id("email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.id("password")).sendKeys("triotend");
		
		//Clearing TEXT in TEXTBOX
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("email")).clear();
		
		//Declaring Web Element
		WebElement d=driver.findElement(By.className("btn"));
		
		//Fetching TEXT written over any web element
		String t=d.getText();
		System.out.println(t);
		
		//To RESIZE the browser window
		Dimension d1=new Dimension(200,900);
		driver.manage().window().setSize(d1);
		
		//To MINIMIZE the browser window
		Point p=new Point(0,3000);
		driver.manage().window().setPosition(p);
		
		//To MAXIMIZE the browser window
		driver.manage().window().maximize();
		
		// To CLOSE the current browser
		driver.close();

	}

}
