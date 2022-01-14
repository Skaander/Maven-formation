import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlertOpti {

	WebDriver driver;

	@Before

	public void Optimize() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://the-internet.herokuapp.com/javascript_alerts";

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

	}

	@After

	public void CloseBrowser() {

		driver.close();
		driver.quit();

	}

	@Test

	public void resultMustBeOk() {

		driver.switchTo().alert().accept();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Ok";

		Assert.assertEquals(ResultatText, ResultatText2);

	}

	@Test

	public void resultShouldNotBeCancel() {

		driver.switchTo().alert().accept();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Cancel ";

		Assert.assertNotEquals(ResultatText, ResultatText2);

	}

	@Test
	public void ResultMustBeCancel() {

		driver.switchTo().alert().dismiss();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Cancel";

		Assert.assertEquals(ResultatText, ResultatText2);

	}

	@Test

	public void ResultShouldNotBeOk() {

		driver.switchTo().alert().dismiss();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Ok";

		Assert.assertNotEquals(ResultatText, ResultatText2);

	}
}
