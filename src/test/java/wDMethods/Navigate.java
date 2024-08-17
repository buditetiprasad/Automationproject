package wDMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
   public static void main(String[] args) throws InterruptedException
   {
	 
	 WebDriver driver =new ChromeDriver();
	 driver.navigate().to("https://ww.amazon.com");
	 //go back
	 Thread.sleep(4000);
	 driver.navigate().to("https://www.amazon.com");
	 
   }
}
