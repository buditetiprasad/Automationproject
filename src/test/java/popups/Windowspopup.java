package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowspopup {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	//main window/ parent window
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//fetch session id of parent window
	String pid = driver.getWindowHandle();
	System.out.println(pid);//7587587587fgthfuu
	
	
	//child win
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	//session Id of child window
	Set<String> allid = driver.getWindowHandles();
	System.out.println(allid);
	
	
	//switch the control of sel from pid to child id
	for(String cid:allid) {
		if(!pid.equals(cid)){
			driver.switchTo().window(cid);
			//enter email adress on child window
			driver.findElement(By.xpath("//input[@id='Form_submitForm_EmailHomePage']")).sendKeys("test@gmail.com");
			//close()>>> sigle window it will close
			//driver.close();
			driver.quit();
			
		}
	}
}
}