package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Class
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	
	//driver.findElement(By.id("user-name")).sendKeys("standard_user", Keys.TAB,"secret_sauce", Keys.ENTER);

	//driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
	driver.findElement(By.xpath("input[@placeholder='First Name']")).sendKeys("Mahesh");
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Kapilavai");
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("509405");
}
}


