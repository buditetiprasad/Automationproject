package locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassA {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		//universal wait >>>>>>>implicity wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//click on create new accput btn
     // driver.findElement(By.xpath("//a[text()]='Create new account']")).click();
     
	
	//driver.findElement(By.xpath("//a[text()=Create new account']")).click();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
      
    //select DD while we should have to handle and store in reference variable
   WebElement  day= driver.findElement(By.xpath("//select[@id='day']"));
   
   //Creat object of select Class
   Select s = new Select(day);
     s.selectByVisibleText("5");
     
     //select mm while we should have to handle and store in reference variable
     WebElement  month = driver.findElement(By.xpath("//select[@id='month]"));
     Select m = new Select(month);
      m.selectByVisibleText("jan");
      
      //select for year
    WebElement y =driver.findElement(By.xpath("//select[@id='year]"));
               m.selectByVisibleText("2003") ;
             //  y.selectByVisibleText("2003");
	}

}
