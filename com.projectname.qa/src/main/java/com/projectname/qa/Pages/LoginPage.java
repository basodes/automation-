package com.projectname.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.projectname.qa.Base.TestBase;

public class LoginPage extends TestBase{
		// Declaration
		// Object Repository
		
		@FindBy (xpath="//img[@alt='Facebook']") private WebElement login_fblogo;
		@FindBy (xpath="//h2[contains(text(),'people in your life.')]") private WebElement login_fbtagline;
		@FindBy (xpath="//input[@id='email']") private WebElement username;
		@FindBy (xpath="//input[@id='pass']") private WebElement password;
		@FindBy (xpath="//button[@name='login']") private WebElement login_btn;
		@FindBy (xpath="//a[text()='Forgotten password?']") private WebElement forgot_password;
		@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement createnew_account;
		@FindBys({@FindBy (xpath="//div[@id='pageFooterChildren']/ul/li/a")}) private List<WebElement> footerlinks;

		// initialization
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		// usage
		
		public void verifyFacebookLoginPageLogo() {
		 Assert.assertTrue(login_fblogo.isDisplayed(),"Facebook Logo is not displayed on login page");
		 Reporter.log("verifyFacebookLoginPageLogo", true);
		}

		public void verifyFacebookLoginPageTagline() {
			Assert.assertTrue(login_fbtagline.isDisplayed());
			Assert.assertEquals(login_fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
			Reporter.log("verifyFacebookLoginPageTagline", true);
		}

		public void verifyFacebookLoginPageForgotPasswordLink() {
			Assert.assertTrue(forgot_password.isDisplayed());
			Assert.assertEquals(forgot_password.getText(), "Forgotten password?");
			Reporter.log("verifyFacebookLoginPageForgotPasswordLink", true);
		}

		public void verifyFacebookLoginPageCreatenewAccoutBtn() {
			Assert.assertTrue(createnew_account.isDisplayed());
			Reporter.log("verifyFacebookLoginPageCreatenewAccoutBtn", true);
		}
		
		public void setFacebookLoginPageUsername() {
			username.sendKeys("ABCDERFFUF");
			Reporter.log("setFacebookLoginPageUsername", true);
		}
		
		public void setFacebookLoginPagePassword() {
			password.sendKeys("ABCDERFFUF");
			Reporter.log("setFacebookLoginPagePassword", true);
		}
		
		public void clickFacebookLoginPageLoginBtn() {
			Assert.assertTrue(login_btn.isDisplayed());
			login_btn.click();
			 Reporter.log("clickFacebookLoginPageLoginBtn", true);
		}
		
		public void verifyFacebookLoginPageFooterlinks() {
			Assert.assertEquals(footerlinks.size(), 31);
			 Reporter.log("verifyFacebookLoginPageFooterlinks", true);
		}
}
