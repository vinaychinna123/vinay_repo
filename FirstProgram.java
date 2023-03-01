package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/"); 
		driver.navigate().to("https://www.amazon.com");
        driver.navigate().back();

	}
}
