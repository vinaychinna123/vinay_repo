package pratice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class Usinglinks 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

		Scanner Sc=new Scanner(System.in);
		System.out.println("enter link to select");
		String linkTexts=Sc.next();
		boolean isexist=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.ebay.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			String WebLink=link.getText();
			if(WebLink.equalsIgnoreCase(linkTexts))
			{
				isexist=true;
				driver.findElement(By.linkText(linkTexts)).click();
				break;
			}
			
		}
		if(isexist==false)
		{
			System.out.println("Specified Link Is not Available in the page..");
		}
	}
}
	 


