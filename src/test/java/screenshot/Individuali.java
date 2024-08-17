package screenshot;
	

	Seimport java.io.File;

import java.io.File;
import java.io.IOException;

	

	 import org.openqa.selenium.By;

	import org.openqa.selenium.Output Type;

	 import org.openqa.selenium. TakesScreenshot;

	import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


 import com.google.common.io.Files;

 public class Individuali {

	

	public static void main(String[] args) throws Throwable {

	WebDriver driver =new ChromeDriver(); driver.get("https://www.google.com");

	driver.manage().window().maximize();

	TakesScreenshot ts =(TakesScreenshot)driver;

	//for google logo

	WebElement ele= driver.findElement(By.xpath("//img[@class='lnXdpd']"));

	//for fb logo

	//WebElement ele2 driver.findElement(By.xpath("//img[@class='fb_logo _811h img']"));

	//File src ele.getScreenshotAs (OutputType. FILE); File src ele.getScreenshotAs (Output Type.FILE);

	File dest = new File("/home/harsh/Desktop/Screenshots/glogo.png");

	Files.copy(src, dest);
}
 }
