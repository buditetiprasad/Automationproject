package Actionsclass;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDrop {

		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

			WebElement sourceElement = driver.findElement(By.id("draggable"));
			WebElement targetElement = driver.findElement(By.id("droppable"));

			Actions actions = new Actions(driver);
			actions.dragAndDrop(sourceElement, targetElement).perform();

			System.out.println("working dropped to targetLocation");
		}


}
