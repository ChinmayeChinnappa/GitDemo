package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Day3 {
	
	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlname) {
		System.out.println("WebloginCarLoan");
		System.out.println(urlname);
	}
	
	@Test(enabled=false)
	public void MobileloginCarLoan() {
		System.out.println("MobileloginCarLoan");
	}
	
	@Test
	public void MobilesigninCarLoan() {
		System.out.println("MobileloginCarLoan");
	}
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("I will execute before suite");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I will execute before all methods in Day3");
	}

	
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void ApiLoginApiCarLoan() {
		System.out.println("LoginApiCarLoan");
	}



}
