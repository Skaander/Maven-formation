package utilites;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Utilities {

	static public void AssertTestResponsive(WebDriver driver, String url, long MaxTime) {

		long Start = System.currentTimeMillis();

		driver.get(url);

		long End = System.currentTimeMillis();

		long Duration = End - Start;

		Assert.assertTrue(Duration < MaxTime);

	}

	static public void AssertTtitleIsTrue(WebDriver driver, String url, String Title) {

		driver.get(url);

		String ActualTitle = driver.getTitle();

		Assert.assertNotEquals(Title, ActualTitle);

	}

	static public void TextisTrue(WebDriver driver, String url, String Text, Actions target) {

		driver.get(url);

		target.moveToElement(driver.findElement(By.xpath(
				"//div[@id='leo-top-menu']//li[@class='parent dropdown aligned-fullwidth']//a[@class='dropdown-toggle has-category']")))
				.moveToElement(driver.findElement(By.xpath(
						"//div[@id='leo-top-menu']//li[@class='parent dropdown aligned-fullwidth']//ul//ul//span[@class='menu-title'][normalize-space()='Cables USB']")))
				.perform();

		String TrueText = driver.findElement(By.xpath(
				"//div[@id='leo-top-menu']//li[@class='parent dropdown aligned-fullwidth']//ul//ul//span[@class='menu-title'][normalize-space()='Cables USB']"))
				.getText();

		Assert.assertNotEquals(TrueText, Text);

	}

}
