package Testng_testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testng_testcases {
	@BeforeTest
	public void beforeTest(){
	System.out.println("beforeTest");	
	}
	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");	

	}
	@BeforeMethod
	public void beforeMethod(){
	System.out.println("beforeMethod");	
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("afterMethod");	

	}	@Test
			public void login(){
				System.out.println("login");
			}
			@Test
			public void logoff(){
				System.out.println("logoff");
			}
}
