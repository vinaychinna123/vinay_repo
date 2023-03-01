package pratice;

import java.lang.invoke.StringConcatException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingxpath2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");  

	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https:\\www.ebay.com");
	  
	  
	  driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("sony");
	  driver.findElement(By.xpath("//*[@id='gh-ac']")).click();
	}
}

