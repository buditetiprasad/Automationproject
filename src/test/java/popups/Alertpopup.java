package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertpopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//write customer ID
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
	//click on submit btn
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	//print the text present on Alert
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	//click on ok button
	driver.switchTo().alert().accept();
}
}