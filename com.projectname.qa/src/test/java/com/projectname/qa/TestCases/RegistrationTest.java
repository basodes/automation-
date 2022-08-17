package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.RegistrationPage;


public class RegistrationTest extends TestBase {
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
	public void FacebookRegistrationPageTest() {
		
		RegistrationPage rgpage = new RegistrationPage(TestBase.driver);   // object ==> constructor
		rgpage.clickFacebookLoginPageSignupLink();
		rgpage.verifyFacebookRegistrationPageFblogo();
		rgpage.verifyFacebookRegistrationPageAlreadyAccount();
		rgpage.setFacebookRegistrationPageFirstName("ABCDEF");
		rgpage.setFacebookRegistrationPageLastName("EFGH");
		rgpage.setFacebookRegistrationPageMobileEmail();
		rgpage.setFacebookRegistrationPagePassword();
		rgpage.setFacebookRegistrationPageBirthDay();
		rgpage.setFacebookRegistrationPageBirthMonth();
		rgpage.setFacebookRegistrationPageBirthYear();
		rgpage.setFacebookRegistrationPageGender("female");
		rgpage.clickFacebookRegistrationPageSubmitBtn();
	}
	
	
}
