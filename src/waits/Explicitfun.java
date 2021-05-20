package waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitfun {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Jars\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		String URL = "http://www.vpl.ca/";
		driver.get(URL);
		
		Boolean isTitleCorrect = wait.until(ExpectedConditions.titleContains("Space"));
		System.out.println("TitleContains result" + isTitleCorrect);
		
		Boolean titleIs = wait.until(ExpectedConditions.titleIs("Vancouver Public Library |"));
		System.out.println("Wait completed for title to be \"Vancouver Public Library |\"" + titleIs);

		Boolean urlContains = wait.until(ExpectedConditions.urlContains("vpl"));
		System.out.println("urlContains results" + urlContains);

		Boolean urlToBe = wait.until(ExpectedConditions.urlToBe("http://www.vpl.ca/"));
		System.out.println("urlToBe results" + urlToBe);

		String regex = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Boolean urlMatches = wait.until(ExpectedConditions.urlMatches(regex));
		System.out.println("urlMatches results" + urlToBe);

		// ExpectedConditions.elementToBeSelected
		WebElement searchDDwn = driver.findElement(By.xpath(".//*[@id='edit-source']"));
		Select dropdown = new Select(searchDDwn);
		dropdown.selectByValue("Website");
		WebElement selected = dropdown.getFirstSelectedOption();
		boolean elementToBeSelected = wait.until(ExpectedConditions.elementToBeSelected(selected));
		System.out.println("elementToBeSelected results" + elementToBeSelected);

		// ExpectedConditions.invisibilityOfElementLocated
		By searchDDwn1 = By.xpath(".//*[@id='edit-source1']");
		boolean invisibilityOfElementLocated = wait.until(ExpectedConditions.invisibilityOfElementLocated(searchDDwn1));
		System.out.println("invisibilityOfElementLocated results" + invisibilityOfElementLocated);

		// ExpectedConditions.invisibilityOfElementWithText
		By searchDDwn2 = By.xpath(".//*[text()='edit-source1']");
		boolean invisibilityOfElementWithText = wait
		.until(ExpectedConditions.invisibilityOfElementWithText(searchDDwn2, "hello"));
		System.out.println("invisibilityOfElementWithText results" + invisibilityOfElementWithText);

		// ExpectedConditions.stalenessOf
		driver.navigate().refresh();
		By searchDDwn3 = By.xpath(".//*[text()='edit-source1']");
		boolean stalenessOf = wait.until(ExpectedConditions.invisibilityOfElementWithText(searchDDwn2, "hello"));
		System.out.println("stalenessOf results" + stalenessOf);

		// ExpectedConditions.textToBePresentInElementLocated
		By searchBoxId = By.id("edit-search");
		WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(searchBoxId));
		searchBox.sendKeys("java");

		boolean res = wait.until(ExpectedConditions.textToBePresentInElementLocated(searchBoxId,"java"));
		System.out.println("textToBePresentInElement results" + stalenessOf);

		By searchButtonId = By.id("edit-submit");
		WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(searchButtonId));
		searchButton.click();

		Thread.sleep(2000);

		// 1. visibilityOfAllElementsLocatedBy

		By titleLocator = By.xpath("//button[@data-test-id='list-view-button']");
		List titles = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(titleLocator));
		int titleCount = titles.size();
		System.out.println("Number of titles" + titleCount);

		By authorLocator = By.xpath("//button[@data-test-id='list-view-button']");
		List author = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(authorLocator));
		int authorCount = author.size();
		System.out.println("Number of authors" + authorCount);

		driver.quit();

	}

}
