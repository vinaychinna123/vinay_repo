package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCloseAndQuit 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");

		//opening Daily Deals link  in a new tab 
		String keycomb=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.linkText("Daily Deals ")).sendKeys(keycomb);
		
		
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println(url + " ==> " + title);
		
		//driver.close();
		driver.quit();
	}
}

			
				
				
		
		

	


