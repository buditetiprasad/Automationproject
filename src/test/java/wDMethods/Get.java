package wDMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get
{
  	
  public static void main(String[] args) 
  {
	WebDriver Driver =new EdgeDriver();
	Driver.get("https://ww.amazon.com");
  }
  
}
