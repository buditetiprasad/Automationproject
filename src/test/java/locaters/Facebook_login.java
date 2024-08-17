package locaters;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_login {

	public static void main(String[] args) throws Throwable
	{
		
         WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//driver. manage(). window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Create new account")).click();

		Thread .sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ranjini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumari");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("7815948078");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("A@C1234qa");
	
		
		 //select DD while we should have to handle and store in reference variable
		   WebElement  day= driver.findElement(By.xpath("//select[@id='day']"));
		   
		   //Creat object of select Class
		   Select s = new Select(day);
		     s.selectByVisibleText("5");
		     
		// select for month
			WebElement  month =  driver.findElement(By.xpath("//select[@id='month']"));	
			   Select s2=new  Select(month);
				   s2.selectByVisibleText("May");
				   
		  //select for year
		   WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		    Select y = new Select(year);
	       y.selectByVisibleText("2003");

		// select gender

		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

		// click for sign up 

		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		driver.findElement(By.xpath("(//input[@name='code'])")).click();

	}

}
