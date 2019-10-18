package day14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gc_reddy_dynamic_browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		String browser = "chrome";
		WebDriver driver = null;
		if(browser.equals("chrome")){
		driver = new ChromeDriver();
		}
		else if(browser.equals("edge")){
			driver = new EdgeDriver();
			}
		else if(browser.equals("firefox")){
			driver = new FirefoxDriver();
			}
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		System.out.println(driver.getTitle());
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys("admin");
		//String u_text = driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[2]/td/form/table/tbody/tr[1]/td/text()")).getText();
		
		System.out.println("User name");
		String u_text = driver.findElement(By.name("username")).getAttribute("value");
				System.out.println("----"+u_text);
		driver.findElement(By.name("password")).sendKeys("admin@123");
		//u_text = driver.findElement(By.xpath("//*[@id='contentText']/table/tbody/tr[2]/td/form/table/tbody/tr[2]/td/input")).getText();
		System.out.println("Password");
		u_text = driver.findElement(By.name("password")).getAttribute("value");
				System.out.println("---"+u_text);
		driver.findElement(By.id("tdb1")).click();
		String url= driver.getCurrentUrl();
		if (!url.contains("http://www.gcrit.com/build3/admin/index.php")){
		String	ErrorMessage=driver.findElement(By.className("messageStackError")).getText();
			System.out.println(ErrorMessage);
			}
		else{
			System.out.println("Login successful");
		}
		
		
		driver.quit();
		

	}

}
