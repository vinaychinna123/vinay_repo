package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");  

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.eaby.com");
		WebElement dd1=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd1);
		//S.selectByIndex(6);
		//S.selectByValue("625");
		s.selectByVisibleText("Cameras & Photo");
		driver.findElement(By.id("gh-ac")).sendKeys("sony");
		driver.findElement(By.id("gh-ac")).click();
	}
}
		
		


