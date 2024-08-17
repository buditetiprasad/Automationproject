package screenshot;



	import java.io.File;

	import java.io.IOException;

	import org.openqa.selenium.Output
import org.openqa.selenium.OutputType;
import org.openqa.selenium. TakesScreenshot;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	import com.google.common.io.Files;

	public class webapgescreenshot {

	public static void main(String[] args) throws Throwable {

	WebDriver driver=new ChromeDriver();

	driver.get("https://www.Facebook.com");

	//typecast

	TakesScreenshot ts=(TakesScreenshot) driver;

	//call getscreenshotAS methodd

	File src=ts.getScreenshotAs (OutputType.FILE);

	//create object of file class

	File dest=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\SCREENSHOTSSSS\\FBpage.png");

	Files.copy(src, dest);

	}

	
}
