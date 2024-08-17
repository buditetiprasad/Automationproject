

	package practices;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Name {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		//maimize browser window
		driver.manage().window().maximize();
		//locator for UN
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//Locator for password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//Locator for login Btn
		driver.findElement(By.name("login-button")).click();
		//title provided by developer
			String expT="Swag Labs";
			String actT=driver.getTitle();
			//verification
			if(expT.equals(actT)) {
				System.out.println("User navigates to Homepage,TC IS PASS");
			}
			else {
				System.out.println("User is not navigates to Home page,TC IS FAILED");
			}
	}
	
}
