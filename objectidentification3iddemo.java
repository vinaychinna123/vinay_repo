package pratice;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectidentification3iddemo {

	public static void main(String[] args) 
		{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

     WebDriver driver=new ChromeDriver();
     driver.manage().window().minimize();
     driver.get("https://www.ebay.com/");
     List<WebElement> links=driver.findElements(By.tagName("a"));
     System.out.println("no.of links in the page:"+links.size());
     System.out.println("the links are");
     for (WebElement link : links) {
		System.out.println(link.getText());
	}
    		 
     
		}
}
		


		