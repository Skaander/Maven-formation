import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJunits {

	@Test

	public void test() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://www.google.com/?hl=fr";
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		String Title1 = driver.getTitle();

		String Title2 = "Google";

		Assert.assertEquals(Title2, Title1);

	}

	public void testcontraire() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://www.google.com/?hl=fr";
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		String Title1 = driver.getTitle();

		String Title2 = "Ghhhh";

		Assert.assertNotEquals(Title2, Title1);

		driver.close();
	}
}
