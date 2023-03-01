package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFrames1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");  

         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(
       "https://www.qhmit.com/html/html_editors/scratchpad/?examplejavascript/examples/javascript_alert_box_onclick");
      driver.switchTo().frame("preview");
      driver.findElement(By.xpath("html/body/input")).click();
      
      
	}

}
