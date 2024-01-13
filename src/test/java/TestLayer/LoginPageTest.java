package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	
		
		@BeforeTest
		public void SetUp() {
			BaseClass.initialization();
			
		}
		
		@Test
		public void validateregPageFunctionality() {
			
			
			LoginPage loginPage = new LoginPage();
			loginPage.regPageFuncationality("rohini", "dake","980000000", "dakerohini@gmail.com", "Pune", "Pune", "Maharashtra", "112211", "INDIA", "rohini.abc", "Pass@123", "Pass@123");
		
		}
		
		@AfterTest
		public void tearDown() {
			driver.quit();
			
		}
		

	}


