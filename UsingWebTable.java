package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class UsingWebTable {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		
		for(int i=2; i<=rows.size();i++)
		{
	
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td"));

			for(int j=1; j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(
						By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.println(cell.getText() + " || ");
			}
			System.out.println();
		}
	}
}

