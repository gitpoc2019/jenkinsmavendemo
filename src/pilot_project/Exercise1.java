package pilot_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//import java.lang.reflect.Array;
//import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) throws InterruptedException {
/*ArrayList<String> list = new ArrayList<String>();
list.add("chrome");
list.add("Firefox");
list.add("Edge");
for(int i=0;i<list.size();i++){
	
		System.out.println(list.get(i));
	}*/

WebDriver driver = null;
String browser ="chrome";

switch (browser) {

case "chrome":
	System.out.println("Browser is chrome");
	driver =new ChromeDriver();
	break;
	
case "Firefox":
	System.out.println("Browser is Firefox");
	driver =new FirefoxDriver();
	break;
	
case "Edge":
	System.out.println("Browser is Edge");
	driver =new EdgeDriver();
	break;
}
driver.get("https://www.qtpselenium.com");
System.out.println(driver.getTitle());
//implicit wait
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
System.out.println(driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/ul/li[4]/a")).getText());
driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/ul/li[4]/a")).click();
System.out.println("Enter "+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[2]/div/form/div[2]/label")).getText());
driver.findElement(By.name("username")).sendKeys("ahsfgkasj");
String S_text = driver.findElement(By.name("username")).getAttribute("value");
System.out.println(S_text);
System.out.println("Enter "+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[2]/div/form/div[3]/label")).getText());
driver.findElement(By.name("password")).sendKeys("asjh");
S_text = driver.findElement(By.name("password")).getAttribute("value");
System.out.println(S_text);
driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[2]/div/form/div[4]/button")).click();
String url="https://www.whizdomtraining.com/user/home";

if(url.equals(driver.getCurrentUrl())){
	System.out.println(" login success");
	
}
else {
	System.out.println(" login fail");
	}
System.out.println(driver.findElement(By.xpath("//*[@id='navbarDropdownMenuLink']/text()")).getText());
driver.findElement(By.xpath("//div[@id='cssmenu']/ul/li[2]/a")).click();

 String course_select=driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[2]/ul/li[1]/a")).getText();
System.out.println(course_select);
driver.findElement(By.xpath("//*[@id='cssmenu']/ul/li[2]/ul/li[1]/a")).click();
String url1="https://www.qtpselenium.com/selenium-training";
try{
	if(url==driver.getCurrentUrl()){
		System.out.println(driver.findElement(By.xpath("/html/body/div[5]/div/aside/a")).getText());
		driver.findElement(By.xpath("/html/body/div[5]/div/aside/a")).click();
	}
}
catch(Exception e){
	e.printStackTrace();
}
	

WebElement we = driver.findElement(By.className("dropdown-item"));
Select s = new Select(we);
//s.selectByIndex(2);
s.selectByVisibleText("Selenium Training");
//s.selectByValue("3");
Thread.sleep(10000);
driver.quit();
}
	
}	

