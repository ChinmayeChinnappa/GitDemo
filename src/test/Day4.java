package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL", "PASS"})
	@Test
	public void WebloginHomeLoan(String urlname, String pass) {
		System.out.println("WebloginHomeLoan");
		System.out.println(urlname);
		System.out.println(pass);
		Assert.assertTrue(false);
	}
	
	@Test(groups={"Smoke"})
	public void MobileloginHomeLoan() {
		System.out.println("MobileloginHomeLoan");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Iwill execute after every method in Day4");
	}

	
	@Test(dataProvider="getData")
	public void LoginApiHomeLoan(String username, String password) {
		System.out.println("LoginApiHomeLoan");
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "FirstUserName";
		data[0][1] = "FirstPass";
		
		data[1][0] = "SecondUserName";
		data[1][1] = "SecondPass";
		
		data[2][0] = "ThirdUserName";
		data[2][1] = "ThirdPass";
		
		return data;
	}

}
