package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class driverclass {

	public static void main(String[] args) {

	//	FirefoxDriver fd = new FirefoxDriver();
	//	fd.get("http://yahoo.com");
	//	fd.close();
	//	
		 // System.setProperty("webdriver.chrome.driver", " C:\\Program Files\\drivers\\chromedriver.exe"); // path of chromedriver 
		  //  WebDriver driver = new ChromeDriver();
		 
		
		WebDriver cd = new ChromeDriver();
		cd.get("http://google.com");
		System.out.println(cd.getTitle());
		
		cd.close();
		
		/*EdgeDriver ed = new EdgeDriver();
		ed.get("http://yahoo.com");
		ed.close();*/
	}

}
