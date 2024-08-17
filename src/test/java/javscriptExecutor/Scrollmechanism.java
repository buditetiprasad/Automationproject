package javscriptExecutor;



import org.openqa.selenium. JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollmechanism {

public static void main(String[] args) throws Throwable {

WebDriver driver=new ChromeDriver();

driver.get("https://www.amazon.in");

//typecast

JavascriptExecutor jse=(JavascriptExecutor)driver;

//scroll down

Thread.sleep(5000);

jse.executeScript("window.scrollBy (0,2000);");

//scroll up

Thread.sleep(5000);

jse.executeScript("window.scrollBy(0,-1000);");
System.out.println("program is print");

}
}


