package diversites;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFunction {

	WebDriver driver;

	@Before

	public void Prequisite() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://demo.guru99.com/test/newtours/register.php";

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

	}

	@Test

	public void SelectTunisieTrue() {

		WebElement Selector = driver.findElement(By.xpath("//select[@name='country']"));

		Select SelectTunisia = new Select(Selector);

		SelectTunisia.selectByValue("TUNISIA");

		String ActualdResult = driver.findElement(By.xpath("//select[@name='country']")).getText();
		String ExpectedResult = "TANZANIA";

		Assert.assertEquals(ExpectedResult, ActualdResult);

	}

}
