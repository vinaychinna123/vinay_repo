package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFindElements 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no.of links in this page : " + links.size() );
		
		
		System.out.println("the links are : " ) ;
		for(WebElement link : links )
		{
			System.out.println(link.getText());
			
	}
}
}

		
		
	