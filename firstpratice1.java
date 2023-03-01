package pratice;

import java.sql.DriverAction;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstpratice1 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");  
		WebDriver Driver=new ChromeDriver();
	Driver.manage().window().maximize();
	
	Driver.get("https://www.ebay.com/");
	
	
	       String KeyComb=Keys.chord(Keys.CONTROL,Keys.RETURN);
	       Driver.findElement(By.linkText("Daily Deals")).sendKeys(KeyComb);
	      // String title=Driver.getTitle();
	       
	       String url=Driver.getCurrentUrl();
	       String winId=Driver.getWindowHandle();
	       Set<String> wins=Driver.getWindowHandles();
	       for(String win : wins)
	       {
	    	   Driver.switchTo().window(win);
	    	  System.out.println(url+" ==> " +Driver.getTitle() );
	       }
	}
	       //Driver.close();
	       //Driver.quit();

}



    
    	

		
		

         	
    	


