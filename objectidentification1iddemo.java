package pratice;

import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class objectidentification1iddemo 
{
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
		WebElement txt=driver.findElement(By.id("gh-ac"));
		txt.sendKeys("sony");
		WebElement btn=driver.findElement(By.id("gh-btn"));
		btn.click();
		
}     
}

		



