
	import java.time.Duration;

	import org.openqa.selenium.By;

	Simport org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.edge.EdgeDriver;

	import org.openqa.selenium.interactions.Actions;

	public class Drag_and_drop {

	public static void main(String[] args) throws Throwable {

	WebDriver driver-new EdgeDriver();

	driver.get("https://demo.guru99.com/test/drag_drop.html");

	//srsele

	WebElement srcele = driver.findElement(By.xpath("//a[text()=' 5000']"))=

	//destele

	WebElement destele driver.findElement(By.xpath("//ol[@id='amt7']"));

	//create object of Actions class Actions a=new Actions (driver);

	a.dragAndDrop (srcele, destele).perform();

	}
}
