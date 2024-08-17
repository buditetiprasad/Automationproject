package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_groupindex {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("standard_user");
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("(//input)[3]")).click();
	}
}