package locaters;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
//		Robot class:-to avoid all drwabacks of keysclass we have robot class here we cane automate all keys
//		on the keyboard[including special characters also]
//		syntx:Robot s= new Robot();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		System.out.println("successfully launced");
		d.get("https://www.amazon.in");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(9000);
		System.out.println("sucessfuly down");
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(9000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		System.out.println("successfuly up");
		d.quit();
		
	}
}