package linkdin_test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_test {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/home");

		driver.manage().window().maximize();

		driver.findElement(By.id("session_key")).sendKeys("pallavipuranik2@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Pallup22@24");
		
	}

}
