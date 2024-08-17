package locaters;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tagname 
{
  public static void main(String[] args) 
  {
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.saucedemo.com");
	
	//syntax of tagname 1

	driver.findElement(By.id("user-name")).sendKeys("standard_user");

	//syntax for pwd

	driver.findElement(By.id("password")).sendKeys("secret_sauce");

	//click on login btn

	driver.findElement(By.id("login-button")).click();
	
	
  }
}
