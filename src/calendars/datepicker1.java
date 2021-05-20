package calendars;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class datepicker1 {
	WebElement dateWidget;
	 List<WebElement> month;
	 List<WebElement> dates;
	 static List<String> monthlist = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
	 
	 public static void main (String[] args) {
		 
	 }
public void datpicker( WebDriver driver, String expDate, int expmonth, int expyear)
{
	
	// calendar Month and Year
	boolean dateNotFound = true;
	
	//WebElements of Date Picker
	driver.findElement(By.className("datepicker-switch")).click();
	
	//while loop to check the month and year
	while( dateNotFound)
	{
		//getting date picker year
		WebElement picyear= driver.findElement(By.cssSelector("div.datepicker-months>table.table.table-condensed>thead>tr>th.datepicker-switch"));
		String CalYear = picyear.getText();
		
		if(Integer.parseInt(CalYear)==expyear)
		{
			selectmonth(driver,expmonth);
			selectdat(driver,expDate);
			dateNotFound=false;
		}
		else if (Integer.parseInt(CalYear)>expyear)
		{
			//Clicking on the left arrow
			driver.findElement(By.cssSelector("/html/body/div[9]/div[1]/table/thead/tr[1]/th[1]")).click();
	
		}
		
		else if(Integer.parseInt(CalYear)<expyear)
		{
			//Click on the right arrow
			driver.findElement(By.cssSelector("/html/body/div[9]/div[1]/table/thead/tr[1]/th[3]")).click();
		}
	}
}
///method to select the month 
public void selectmonth(WebDriver driver,int Month)
{
	 month= driver.findElements(By.cssSelector("span.month"));
	 
  for (WebElement mon : month) 
    {
 	   String calmon=mon.getText();
 	   String expmon=monthlist.get(Month-1);
        if(calmon.equals(expmon))
          {
     	    mon.click();
     	     
     	     break;
          }           
		
	    }

  
 }

//method select date
public void selectdat(WebDriver driver,String expDate)
{
	  
	  dateWidget =driver.findElement(By.cssSelector("div.datepicker-days"));
	  dates=dateWidget.findElements(By.cssSelector("td.day"));
	  
	 for (WebElement eldat : dates) {
		//System.out.println(eldat.getText());
		 if(eldat.getText().equals(expDate))
		 {
			eldat.click();
			break;
		 }
		
	}

}      

}
