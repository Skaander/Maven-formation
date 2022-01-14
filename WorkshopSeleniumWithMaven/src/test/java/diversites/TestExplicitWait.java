package diversites;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExplicitWait {

	WebDriver driver;

	@Before

	public void Prequisite() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "http://demo.guru99.com/V1/index.php";

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

	}

	@Test

	public void ReTestExplicit() {

		driver.findElement(By.xpath("//a[normalize-space()='Security Project']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 1);

		WebElement UserID = driver.findElement(By.xpath("//input[@name='uid']"));

		wait.until(ExpectedConditions.visibilityOf(UserID));

		UserID.sendKeys("Name");

	}

}
