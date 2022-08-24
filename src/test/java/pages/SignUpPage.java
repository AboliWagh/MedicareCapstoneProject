package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testCases.BaseClass;

public class SignUpPage {

	WebDriver driver = BaseClass.driver;

	ExtentTest test = BaseClass.test;

	//////////////////// Web Elements /////////////////////////////

	@FindBy(id = "signup")
	WebElement Signup;

	@FindBy(name = "firstName")
	WebElement FirstName;

	@FindBy(id = "lastName")
	WebElement LastName;

	@FindBy(id = "email")
	WebElement Email;

	@FindBy(xpath = "//*[@name='contactNumber']")
	WebElement ContactNo;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "confirmPassword")
	WebElement Confirmpassword;

	@FindBy(xpath = "//*[@id='role2']")
	WebElement SupplierRole;

	@FindBy(name = "_eventId_billing")
	WebElement NextBilling;

	@FindBy(id = "addressLineOne")
	WebElement Addressone;

	@FindBy(id = "addressLineTwo")
	WebElement Addresstwo;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(id = "postalCode")
	WebElement postalcode;

	@FindBy(id = "state")
	WebElement State;

	@FindBy(id = "country")
	WebElement Country;

	@FindBy(name = "_eventId_confirm")
	WebElement NextConfirm;

	@FindBy(xpath = "//*[@class='btn btn-lg btn-primary']")
	WebElement Confirm;

	@FindBy(xpath = "//*[@class='btn btn-lg btn-success']")
	WebElement SucessLogin;

	@FindBy(id = "username")
	WebElement NewSupplierUsername;

	@FindBy(id = "password")
	WebElement NewSupplierPassword;

	@FindBy(xpath = "//*[@class='btn btn-primary']")
	WebElement Loginagain;

	public SignUpPage() {

		PageFactory.initElements(driver, this);
	}

	public void NewsupplierFunction(String firstnameval, String Lastnameval, String emailval, String contactval,
			String PasswordVal, String ConfirmPasswordval, String Addressoneval,
			String addresslinetwoval, String cityval, String postalCodeval, String state, 
			String country) throws InterruptedException {

		Signup.click();
		test.log(LogStatus.PASS, "Click on SignUp", "SignUp Link clicked successfully");

		Thread.sleep(2000);
		
		FirstName.sendKeys(firstnameval);
		test.log(LogStatus.PASS, "Enter FirstName", "FirstName Entered successfully");

		LastName.sendKeys(Lastnameval);
		test.log(LogStatus.PASS, "Enter LastName", "LastName Entered successfully");

		Email.sendKeys(emailval);
		test.log(LogStatus.PASS, "Email", "Email Entered successfully");
		
		ContactNo.sendKeys(contactval);
		test.log(LogStatus.PASS, "Email", "Email Entered successfully");

		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "ContactNo", "ContactNo Entered successfully");

		Confirmpassword.sendKeys(ConfirmPasswordval);
		test.log(LogStatus.PASS, "ConfirmPassword", "ConfirmPassword Entered successfully");

		SupplierRole.click();
		test.log(LogStatus.PASS, "SupplierRole", "SupplierRole Clicked successfully");

			
		NextBilling.click();
		test.log(LogStatus.PASS, "NextBilling", "NextBilling Clicked successfully");

		Thread.sleep(2000);
		
		Addressone.sendKeys(Addressoneval);
		test.log(LogStatus.PASS, "Addressone", "Addressone Entered successfully");

		Addresstwo.sendKeys(addresslinetwoval);
		test.log(LogStatus.PASS, "Addresstwo", "Addresstwo Entered successfully");

		City.sendKeys(cityval);
		test.log(LogStatus.PASS, "City", "city Entered successfully");

		postalcode.sendKeys(postalCodeval);
		test.log(LogStatus.PASS, "postalcode", "postalcode Entered successfully");

		State.sendKeys(state);
		test.log(LogStatus.PASS, "State", "State Entered successfully");

		Country.sendKeys(country);
		test.log(LogStatus.PASS, "Country", "Country Entered successfully");

		NextConfirm.click();
		test.log(LogStatus.PASS, "Click NextConfirm", "NextConfirm Entered successfully");
		
		Thread.sleep(2000);
		
		Confirm.click();
		test.log(LogStatus.PASS, "Click Confirm button ", "Confirm clicked successfully");

		Thread.sleep(1000);
		
		SucessLogin.click();
		test.log(LogStatus.PASS, "Click SucessLogin button ", "SucessLogin clicked successfully");
		
		Thread.sleep(2000);
		
	}

	 public void NewsupplierLoginFunction(String emailval1,String PasswordVal1) throws InterruptedException {
		 NewSupplierUsername.sendKeys(emailval1);
			test.log(LogStatus.PASS, "Enter FirstName", "FirstName Entered successfully");

			NewSupplierPassword.sendKeys(PasswordVal1);
			test.log(LogStatus.PASS, "Enter Password", "password Entered successfully");
			Thread.sleep(500);
			Loginagain.click();
			test.log(LogStatus.PASS, "Click Loginagain button ", "Loginagain clicked successfully");
	 }

}
