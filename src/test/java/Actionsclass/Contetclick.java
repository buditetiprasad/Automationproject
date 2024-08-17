package Actionsclass;


	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

	import org.openqa.selenium.interactions.Actions;

	public class Contetclick {

	public static void main(String[] args) {

	WebDriver driver= new ChromeDriver();

	driver.get("https://www.google.com");
	driver.

	driver.manage().window().maximize();

	//store the element which we should have to handle

	WebElement gmail =driver.findElement(By.xpath("//a[text()='Gmail']"));

	//create object of Actions class

	Actions a=new Actions (driver);

	//rightclick

	a.moveToElement(gmail).contextClick().perform();

	}

	}

