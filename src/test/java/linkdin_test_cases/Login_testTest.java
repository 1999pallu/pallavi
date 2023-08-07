package linkdin_test_cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class Login_testTest {									
	static WebDriver driver;

	@Before
	public static void setUp() {
		driver = new ChromeDriver();
		driver.get("\"https://in.linkedin.com/");
		driver.manage().window().maximize();
		// String baseURL = "https://www.linkedin.com/login";

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("input[@id='session_key']")).click();
		driver.findElement(By.id("session_key")).sendKeys("pallavipuranik2@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"session_password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("Pallup22@24");
		driver.findElement(By.xpath("//button[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
	}

}
