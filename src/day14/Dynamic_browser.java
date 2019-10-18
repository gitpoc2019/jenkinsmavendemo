package day14;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_browser {

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
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	System.out.println(driver.getTitle());
	//implicit wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try{
	driver.findElement(By.id("login1")).sendKeys("12345");
	String u_text = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[1]")).getText();
	System.out.println(u_text);
	u_text = driver.findElement(By.id("login1")).getAttribute("value");
			System.out.println(u_text);
	driver.findElement(By.id("password")).sendKeys("dfdjk23");
	 u_text = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[3]/div[1]")).getText();
	System.out.println(u_text);
	u_text = driver.findElement(By.id("password")).getAttribute("value");
			System.out.println(u_text);
	driver.findElement(By.name("proceed")).click();
	Thread.sleep(10000);

	String e_text = driver.findElement(By.xpath("//*[@id='login']/div/div[1]")).getText();
	System.out.println(e_text);
	
	}
	catch(Exception e){
		System.out.println(e.getStackTrace());
	}
	finally{
	driver.quit();
	}
	}

}
