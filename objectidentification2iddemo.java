package pratice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class objectidentification2iddemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.google.com/");
	Driver.findElement(By.name("q")).sendKeys("selenium webdriver");
	}
}
