package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{

	
		
		//find object repoistory
		
		@FindBy(name="firstName")
		private WebElement fname;
		
		@FindBy(name="lastName")
		private WebElement lname;
		
		@FindBy(name="phone")
		private WebElement mobile;
		
		@FindBy(name="userName")
		private WebElement uname;
		
		@FindBy(name="address1")
		private WebElement address;
		
		@FindBy(name="city")
		private WebElement city ;
		
		@FindBy(name="state")
		private WebElement state;
		
		@FindBy(name="postalCode")
		private WebElement pin;
		
		@FindBy(name="country")
		private WebElement country;
		
		@FindBy(name="email")
		private WebElement useremail ;
		
		@FindBy(name="password")
		private WebElement pass;
		
		@FindBy(name="confirmPassword")
		private WebElement conpass;
		
		@FindBy(name="submit")
		private WebElement submit;
		
		//initialize
		
		public LoginPage() {
			PageFactory.initElements(driver, this);
		}
		
		//Create associated methods
		
		public void regPageFuncationality(String fname1,String lname1,String mobile1,String uname1,String addr,String city1,
				String state1,String pincode1,String country1, String useremail1,String pass1, String confpass1) {
			
			fname.sendKeys(fname1);
			lname.sendKeys(lname1);
			mobile.sendKeys(mobile1);
			uname.sendKeys(uname1);
			address.sendKeys(addr);
			city.sendKeys(city1);
			state.sendKeys(state1);
			pin.sendKeys(pincode1);
			country.sendKeys(country1);
			useremail.sendKeys(useremail1);
			pass.sendKeys(pass1);
			conpass.sendKeys(confpass1);
			
			submit.click();
		}
		
		

	}


