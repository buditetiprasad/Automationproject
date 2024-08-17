package dropdown;


import org.openqa.selenium.By;
import (link unavailable);
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_login {
    public static void main(String[] args) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("(link unavailable)");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vijay");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("prasad");
        driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("7815948078");
        driver.findElement(By.xpath("//input[@name='reg_password']")).sendKeys("BaLaJi@123roj");

        // Select day, month, and year
        WebElement dayDropdown = driver.findElement((link unavailable)("day"));
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByVisibleText("10");

        WebElement monthDropdown = driver.findElement((link unavailable)("month"));
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText("Jan");

        WebElement yearDropdown = driver.findElement((link unavailable)("year"));
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText("2003");

        // Select gender
        driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

        // Click Sign Up
        driver.findElement(By.name("websubmit")).click();
    }
}


Please replace "/path/to/chromedriver" with the actual path to your ChromeDriver executable.

Note: The code is using the id attribute to find the day, month, and year dropdowns. If the id attribute is not present in the HTML, you may need to use a different locator strategy, such as xpath or cssSelector.