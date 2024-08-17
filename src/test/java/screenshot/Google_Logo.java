package screenshot;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Google_Logo
{






public static void main(String[] args) throws Throwable 
 {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	//typr cost
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	//stire element in referenct variabe
	WebElement logo =driver.findElement(By.xpath("//imge[@class='inxdpd']"));
	
	//tack the screen shot
File src=logo.getScreenshotAs(OutputType.FILE);
File dest= new File("C:\\Users\\WINDOWS\\Desktop\\screenshotvijay");
Files.copy(src, dest);
	
}
}
