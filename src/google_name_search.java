import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class google_name_search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("narendran kasi");
	driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
	driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div[1]/div/div/div[1]/a/h3")).click();

Thread.sleep(10000);	
	}
	

}
