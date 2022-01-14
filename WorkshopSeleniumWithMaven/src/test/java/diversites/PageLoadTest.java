package diversites;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utilites.Utilities;

public class PageLoadTest {

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

	public void ClseBrows() {

		driver.close();
		driver.quit();
	}

	@Test

	public void TestRespose() {

		long Start = System.currentTimeMillis();

		driver.get(url);

		long End = System.currentTimeMillis();

		long Duration = End - Start;

		long MaxTime = 8000;

		Assert.assertTrue(Duration < MaxTime);
	}
}
