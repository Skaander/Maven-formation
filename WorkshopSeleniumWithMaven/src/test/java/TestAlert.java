import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {
	

	

	@Test

	public void resultMustBeOk() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://the-internet.herokuapp.com/javascript_alerts";
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		driver.switchTo().alert().accept();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Ok";

		Assert.assertEquals(ResultatText, ResultatText2);

		driver.close();
		driver.quit();

	}

	@Test

	public void resultShouldNotBeCancel() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://the-internet.herokuapp.com/javascript_alerts";
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		driver.switchTo().alert().accept();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Cancel ";

		Assert.assertNotEquals(ResultatText, ResultatText2);

		driver.close();
		driver.quit();

	}

	@Test
	public void resultMustBeCancel() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://the-internet.herokuapp.com/javascript_alerts";
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		driver.switchTo().alert().dismiss();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Cancel";

		Assert.assertEquals(ResultatText, ResultatText2);

		driver.close();
		driver.quit();

	}

	@Test

	public void resultShouldNotBeOk() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://the-internet.herokuapp.com/javascript_alerts";
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		driver.switchTo().alert().dismiss();

		String ResultatText = driver.findElement(By.xpath("//p[@id='result']")).getText();

		String ResultatText2 = "You clicked: Ok";

		Assert.assertNotEquals(ResultatText, ResultatText2);

		driver.close();
		driver.quit();

	}
}
