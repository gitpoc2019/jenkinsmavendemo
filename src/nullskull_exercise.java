import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class nullskull_exercise {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.nullskull.com/articles/SumCaptchaTest.aspx");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String x = driver.findElement(By.cssSelector("#lblNum1")).getText();
	String y = driver.findElement(By.cssSelector("#lblNum2")).getText();
	
	int a= Integer.parseInt(x);
	System.out.println(a);
	int b= Integer.parseInt(y);
	System.out.println(b);
	int sum=a+b;
	 String str1 = Integer.toString(sum);
	driver.findElement(By.xpath("//*[@id='txtSum']")).sendKeys(str1);
System.out.println(str1);
	driver.findElement(By.cssSelector("#Button1")).click();
	}

}
