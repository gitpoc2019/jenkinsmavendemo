import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class exercise {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/login/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("chitradevid@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("Yaashdiya19");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.name("q")).sendKeys("M Malini Maran");
		Thread.sleep(10000);
	driver.findElement(By.cssSelector("ul[id=facebar_typeahead_view_list] a[class=_19bs]")).click();

	driver.findElement(By.linkText("M Malini Maran")).click();
	
	driver.quit();
	}

}
