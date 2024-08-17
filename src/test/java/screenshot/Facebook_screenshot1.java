package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Facebook_screenshot1 
{
public static void main(String[] args) throws Throwable 
{
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.google.com");
	//type cost
	TakesScreenshot ts =(TakesScreenshot)driver;
	
	//call getscreenshotAs mothed
	File src =ts.getScreenshotAs(OutputType.FILE);
	
	//creat obj of File class
	File dest = new File("C:\\Users\\WINDOWS\\Desktop\\screenshotvijaygpage.pang");
	
	Files.copy(src,dest);
}
}
