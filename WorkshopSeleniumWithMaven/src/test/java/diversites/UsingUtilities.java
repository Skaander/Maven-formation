package diversites;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilites.Utilities;

public class UsingUtilities {

	WebDriver driver;
	String url = "https://www.wiki.tn/";
	Actions target;

	@Before

	public void Prequisite() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		driver = new ChromeDriver();
		target = new Actions(driver);

		driver.manage().window().maximize();

	}

	@After

	public void CloseBrows() {

		driver.close();
		driver.quit();
	}

	@Test

	public void TestResponse() {

		long MaxTime = 5000;

		Utilities.AssertTestResponsive(driver, url, MaxTime);

		Utilities.AssertTtitleIsTrue(driver, url, "Google");

		Utilities.TextisTrue(driver, url, "TextisWrong", target);

	}

}
