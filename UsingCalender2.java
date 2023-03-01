package pratice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalender2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month to select : ");
		String month=sc.next();
		month=month.substring(0,3); //taking first 3 chars from user given month
		System.out.println("Enter day to select : ");
		String day=sc.next();
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in");
		
		
		//click on date field 
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		
		
		//month selection 
		//get the month field 
		//get the text of the month field 
		//get the first 3 chars from the months field text 
		 while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onwords_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0,3).equalsIgnoreCase(month))
		 {
			 //click on ">" button 
			 driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
			 }
		    //day selection
		 List<WebElement> rows=driver.findElements(By.xpath(
					"//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));

			for(int i=3;i<=rows.size();i++)
			{
				List<WebElement> cols=driver.findElements(By.xpath(
						"//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));

				for(int j=1;j<=cols.size();j++)
				{
					WebElement cell=driver.findElement(By.xpath(
							"//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j + "]"));

					if(cell.getText().equals(day))
					{
						cell.click();
						break;
					}
		 
				}
			 
		 }
		
		
	}
}
		

	


