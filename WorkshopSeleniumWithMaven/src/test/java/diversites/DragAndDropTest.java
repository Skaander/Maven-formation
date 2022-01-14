package diversites;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	WebDriver driver;
	Actions DragNDrop;
	WebElement Amount;
	WebElement Credit;

	@Before

	public void Prequisite() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://demo.guru99.com/test/drag_drop.html";

		driver = new ChromeDriver();

		DragNDrop = new Actions(driver);

		driver.get(url);

		driver.manage().window().maximize();

		Amount = driver.findElement((By.xpath("//section[@id='g-container-main']//li[2]//a[1]")));

		Credit = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));

		DragNDrop.dragAndDrop(Amount, Credit).perform();

	}

	@After

	public void EndTest() {

		driver.close();
		driver.quit();
	}

	@Test

	public void CreditShouldbePositive() {

		WebDriverWait WaitCell = new WebDriverWait(driver, 5);

		WaitCell.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ol[@id='amt7']")));

		String Actual = driver.findElement(By.xpath("//ol[@id='amt7']")).getText();

		String Expected = "5000";

		Assert.assertEquals(Expected, Actual);

	}

	@Test

	public void AccountShouldBeNull() {

		String ActualAccount = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']")).getText();

		String ExpectedAccount = "5000";

		Assert.assertNotEquals(ExpectedAccount, ActualAccount);
	}

}
