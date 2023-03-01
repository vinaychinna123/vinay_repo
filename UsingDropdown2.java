package pratice;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.domstorage.model.Item;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter category to be selected : ");
		String cat=sc.nextLine();
		System.out.println("Enter product to be searched : ");
        String prod=sc.nextLine();
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");

        
       boolean isExist=false;
       
       
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://ebay.com");
       
       
       WebElement dd1=driver.findElement(By.id("gh-cat"));
       Select s=new Select(dd1);
       
       List<WebElement> items=s.getOptions();
       
       for(WebElement item : items )
       {
    	   		String webcat=item.getText();
    	   		if(webcat.equalsIgnoreCase(cat))
    	   {
    		   isExist=true;
    		   s.deselectByVisibleText(webcat);
    		   driver.findElement(By.id("gh-ac")).sendKeys(prod);
    		   driver.findElement(By.id("gh-btn")).click();
    		   break;
    	   }
       }
       if(isExist=false);
       {
    	   System.out.println("specified item is not available in the dropdown....");
       }
	}
}

    		   
 