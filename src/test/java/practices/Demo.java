package practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Demo {
	public static void main(String[] args)
	{
	 WebDriver Driver = new ChromeDriver();
	Driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("moblies under 20000");
		
	//	WebDriver Driver = new EdgeDriver ();
		Driver.get("https://www.amazon.com");
		Driver.manage().window().maximize();
		Driver.get("https://wwwamazon.com");
		Driver.manage().window().fullscreen();
		Driver.get("https://www.amazon.com");
	}

	
	}


