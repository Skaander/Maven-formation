package diversites;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElectronicSignature {

	WebDriver driver;

	@Before

	public void Prequisite() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		String url = "https://szimek.github.io/signature_pad/";

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

	}

	@Test

	public void DrawSignature() {

		WebElement target = driver.findElement((By.xpath("//div[@class='signature-pad--body']//canvas")));

		Actions draw = new Actions(driver);

		draw.moveToElement(target, 1, 1);

		draw.clickAndHold(target).moveByOffset(10, 15).moveByOffset(17, 20).moveByOffset(35, 40).moveByOffset(75, -18)
				.moveByOffset(150, 18).moveByOffset(25, -17).moveByOffset(115, -250).moveByOffset(-75, 220)
				.moveByOffset(-500, -100).moveByOffset(200, 300).perform();

		draw.release(target);

		driver.findElement(By.xpath("//button[normalize-space()='Save as PNG']")).click();

	}

}
