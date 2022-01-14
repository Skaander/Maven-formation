import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTrue {

	@Test

	public void checkGoogleTitleIsCorrect() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://www.google.com/?hl=fr";

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		Assert.assertTrue(driver.getTitle().contains("G"));
		driver.close();
		driver.quit();

	}

	@Test

	public void checkGoogleTitle() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://www.google.com/?hl=fr";

		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		Boolean Titre = driver.getTitle().contains("H");

		Assert.assertFalse(Titre);

		driver.close();
		driver.quit();
	}
}
