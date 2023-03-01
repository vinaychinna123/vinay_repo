package pratice;

import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;

import javax.sql.RowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalender1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VINAY\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		//click on the data field 
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		
		//Day Selection
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
	
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));
					
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath(
						"//*[@id='rb-calendar_onward_cal']/table/tbody/tr[\" + i + \"]/td[" + j +"]/td"));
				
				if (cell.getText().equals("15"))
				{
			      cell.click();
			      break;
				}
			}
		}
	}
}

			      
			
		
		
		


