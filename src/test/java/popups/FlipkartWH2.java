package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartWH2 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("Mobiles under 20000");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		//Xpath by contains using visible text
		String Phname = driver.findElement(By.xpath("//div[contains(text(),'vivo T3x 5G (Crimson Bliss, 128 GB)')]")).getText();
		System.out.println(Phname);
		driver.findElement(By.xpath("//div[contains(text(),'vivo T3x 5G (Crimson Bliss, 128 GB)')]")).click();
		Set<String>winids = driver.getWindowHandles();
		System.out.println(winids);
		for(String cid:winids) {
			if(!winids.equals(pid)) {
				driver.switchTo().window(cid);				
			}
		
		}
		String title1 = driver.getTitle();
		System.out.println(title1);
		String phname = driver.findElement(By.xpath("//span[text()='vivo T3x 5G (Crimson Bliss, 128 GB)']")).getText();
		System.out.println(phname);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(pid);
		driver.findElement(By.xpath("//div[text()='Motorola g64 5G (Pearl Blue, 128 GB)']")).click();
		String pid1 = driver.getWindowHandle();
		System.out.println(pid1);
		Set<String>winids1 = driver.getWindowHandles();
		System.out.println(winids1);
		for(String cid1:winids1) {
			if(!winids1.equals(pid1)) {
				driver.switchTo().window(cid1);
				
			}
			
		
		}
		String title2 = driver.getTitle();
		System.out.println(title2);
		String phname2 = driver.findElement(By.xpath("//span[text()='Motorola g64 5G (Pearl Blue, 128 GB)']")).getText();
		System.out.println(phname2);
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		//driver.close();
		
	}

}
//Flipkart adding items to cart using window handling