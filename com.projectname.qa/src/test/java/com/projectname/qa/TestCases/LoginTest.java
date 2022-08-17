package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.LoginPage;



public class LoginTest extends TestBase{

	WebDriver driver;
	// Open browser ==> Test Registration page ==> close the browser.
	
	@BeforeClass
	public void setup() {
		intializeBrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	
	
	@Test
	public void FacbookLoginPageTest() {
		LoginPage lp = new LoginPage(TestBase.driver);
		lp.verifyFacebookLoginPageLogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageForgotPasswordLink();
		lp.verifyFacebookLoginPageCreatenewAccoutBtn();
		lp.verifyFacebookLoginPageFooterlinks();
		lp.setFacebookLoginPageUsername();
		lp.setFacebookLoginPagePassword();
		lp.clickFacebookLoginPageLoginBtn();
		
	}
}
