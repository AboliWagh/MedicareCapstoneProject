package pages;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testCases.BaseClass;

public class LoginPage {

	WebDriver driver = BaseClass.driver;

	ExtentTest test = BaseClass.test;

	// =============== Web Elements =====================//
	@FindBy(id = "login")
	WebElement LoginLink;

	@FindBy(name = "username")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[2]")
	WebElement LoginButton;

	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	// =============== Functions =====================//
	public void LoginFunction(String UserNameVal, String PasswordVal) {

		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");

		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter UserName", "Name Entered successfully");

		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Password", "Password Entered successfully");

		LoginButton.click();
		test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");

	}


	
}
