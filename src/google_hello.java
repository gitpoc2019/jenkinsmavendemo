import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google_hello {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		// Wait until the google page shows the result

		Thread.sleep(10000);
		// driver.navigate().to(third_link);

		String option = "Hello taxi";
		driver.findElement(
				By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"))
				.sendKeys("Hello ");

		List<WebElement> findElements = driver.findElements(By
				.xpath("//ul[@role='listbox']/li"));

		// this are all the elements in search list
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());

		}

		driver.findElement(
				By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"))
				.clear();
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"))
				.sendKeys(option);
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//ul[@role='listbox']/li[1]/div/div[1]/div/span"))
				.click();
		System.out.println("---------------------------------");
		System.out.println(driver.findElement(
				By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div[1]/a/h3"))
				.getText());
		driver.quit();

	}

}
