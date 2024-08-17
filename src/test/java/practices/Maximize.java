package practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize
{
  public static void main(String[] args)throws Throwable
  {
	

  WebDriver driver =new ChromeDriver();
  driver.navigate().to("https://ww.amazon.com");
 
  //go back
  Thread.sleep(4000);
  driver.navigate().back();
  //go forward
  driver.navigate().forward();
  //REFRESH THE PAGE
  driver.navigate().refresh();
  //close all tables
  driver.quit();
  
}
}
