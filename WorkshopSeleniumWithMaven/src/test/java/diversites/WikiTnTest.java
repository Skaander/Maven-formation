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

public class WikiTnTest {

	WebDriver driver;
	Actions target;

	@Before

	public void Prequisite() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://www.wiki.tn/";

		driver = new ChromeDriver();

		target = new Actions(driver);

		driver.get(url);

		driver.manage().window().maximize();

	}

	@After

	public void CloseBrows() {

		driver.close();
		driver.quit();

	}

	@Test

	public void HoverOver() {

		WebElement Accessories = driver.findElement(By.xpath(
				"//div[@id='leo-top-menu']//span[@class='menu-title'][normalize-space()='Accessoires & Périphériques']"));

		WebElement Cables = driver.findElement(By.xpath(
				"//div[@id='leo-top-menu']//li[@class='parent dropdown aligned-fullwidth']//ul//ul//span[@class='menu-title'][normalize-space()='Cables USB']"));

		target.moveToElement(Accessories).moveToElement(Cables).click();

		target.perform();

		WebDriverWait WaitElement = new WebDriverWait(driver, 10);

		WaitElement
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Cables USB']")));

		String ActualResult = driver.findElement(By.xpath("//h1[normalize-space()='Cables USB']")).getText();
		String ExpectedResult = "CABLES USB";

		Assert.assertEquals(ExpectedResult, ActualResult);

	}

}
