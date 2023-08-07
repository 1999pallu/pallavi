package linkdin_test_cases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {

	public WebDriver driver;
	
	@Before
	public void BeforeTest() {
		driver = new EdgeDriver();
		driver.get("\\\"https://in.linkedin.com/");
		driver.manage().window().maximize();
		
	}
	@Test 
	public void TestCase() {
		driver.findElement(By.xpath("input[@id='session_key']")).click();
		driver.findElement(By.id("session_key")).sendKeys("pallavipuranik2@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"session_password\"]")).click();
		driver.findElement(By.id("password")).sendKeys("Pallup22@24");
		driver.findElement(By.xpath("//button[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();
	}
	@After
	public void TarDown() {
		driver.quit();
	}
}
