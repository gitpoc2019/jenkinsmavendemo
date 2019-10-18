package pilot_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class icici_car_loan {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
		WebDriver driver =null;
		String browser = "Chrome";

		if (browser=="Chrome"){
	
			driver=new ChromeDriver();
		}
		else if (browser=="Edge"){
			driver=new EdgeDriver();
		}
		else if (browser=="Firefox"){
			driver=new FirefoxDriver();
		}

	  driver.get("https://loan.icicibank.com/asset-portal/auto-loan/check-eligibility?WT.mc_id=WS_NLI_HP_flyout_cl");
		System.out.println(driver.getTitle());
		
		WebElement element = driver.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div/form/div[1]/p"));
   	
		System.out.println(element.getText());
		
		//driver.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div/form/div[2]/div[1]/div/div/button/span[1]")).click();
		
		//driver.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div/form/div[2]/div[1]/div/div/div/ul/li[2]/a")).click();
		//*[@id="check-eligibility-page"]/div[4]/div/div/form/div[2]/div[1]/div/div/div/ul/li[2]/a/span[1]
		//*[@id="check-eligibility-page"]/div[4]/div/div/form/div[2]/div[1]/div/div/button/span[1]
	//Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div/form/div[2]/div[1]/div/div/button/span[1]")));
		//dropdown.selectByVisibleText("Auto Loan Top Up");
		
		//*[@id="check-eligibility-page"]/
		driver.findElement(By.id("mobileNumber")).sendKeys("9444356781");
		driver.findElement(By.id("1553732549982")).sendKeys("42310954734598");
		
		
		
		Thread.sleep(10000);
		driver.quit();
		
		//System.out.println(dropdown.getFirstSelectedOption());

		
		//we.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div/form/div[2]/div[1]/div/div/button/span[1]")).click();
		//we.findElement(By.xpath("//*[@id='check-eligibility-page']/div[4]/div/div/form/div[2]/div[1]/div/div/button/span[1]")).click();
		
		//String elementType= driver.findElement(By.linkText("Gmail")).getAttribute("value");
		//System.out.println(elementType);*/
	
		//driver.findElement(By.name("country_id")).sendKeys("India");
				//we = driver.findElement(By.name("country_id"));
				//Select s = new Select(we);
				//s.selectByIndex(2);
				//s.selectByVisibleText("India");
				//s.selectByValue("3");
}

}
