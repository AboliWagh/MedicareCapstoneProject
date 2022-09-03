package pages;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class ShoppingPage {

	WebDriver driver = BaseClass.driver;
	JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;

	ExtentTest test = BaseClass.test;

	// =============== Web Elements =====================//
	
	@FindBy(xpath = "//a[@href='/medicare/show/1/product']")
	WebElement ParacetamolView;

	@FindBy(xpath = "//a[@href='/medicare/cart/add/1/product']")
	WebElement Addtocart;

	//@FindBy(xpath = "//a[@href='/medicare/show/all/products']")
	//WebElement ContinueShopping;

	//@FindBy(xpath = "//a[@href='/medicare/show/5/product']")
	//WebElement AmoxicillinView;
	
	//@FindBy(xpath = "//a[@href='/medicare/cart/add/5/product']")
	//WebElement Addtocart5;
	

	@FindBy(xpath = "// a[@href='/medicare/cart/validate") // a[@href='/medicare/cart/validate']

	WebElement Checkout;

	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement Select;

	@FindBy(id = "cardNumber")
	WebElement cardnumber;

	@FindBy(id = "expityMonth")
	WebElement expirymonth;

	@FindBy(id = "expityYear")
	WebElement expiryyear;

	@FindBy(id = "cvCode")
	WebElement CVnumber;

	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
	WebElement Pay;

	public ShoppingPage() {

		PageFactory.initElements(driver, this);
	}

	// =============== Functions =====================//

	public void ShoppingFunction(String CardVal, String Expirymonth, String Expiryyear, String cvnumber)
			throws InterruptedException {

		
		ParacetamolView.click();
		test.log(LogStatus.PASS, "Click on ParacetamolView", "ParacetamolView clicked successfully");

		Thread.sleep(500);
		Addtocart.click();
		test.log(LogStatus.PASS, "Click on Addtocart", "Addtocart clicked successfully");

		//Thread.sleep(500);

		//ContinueShopping.click();
		//test.log(LogStatus.PASS, "Click on ContinueShopping", "ContinueShopping clicked successfully");

		//AmoxicillinView.click();
		//test.log(LogStatus.PASS, "Click on AmoxicillinView", "AmoxicillinView clicked successfully");

		Thread.sleep(500);
		//Addtocart5.click();
		//test.log(LogStatus.PASS, "Click on Addtocart", "Addtocart clicked successfully");

		Thread.sleep(1000);
		//js.executeScript("arguments[1].click();",Checkout );
		Checkout.click();
		test.log(LogStatus.PASS, "Click on Checkout", "Checkout clicked successfully");

		Select.click();
		test.log(LogStatus.PASS, "Click on Selectaddress", "Selectaddress clicked successfully");

		cardnumber.sendKeys(CardVal);
		test.log(LogStatus.PASS, "Enter Card Number", "Card Number Entered successfully");

		expirymonth.sendKeys(Expirymonth);
		test.log(LogStatus.PASS, "Enter Card Number", "Card Number Entered successfully");

		expiryyear.sendKeys(Expiryyear);
		test.log(LogStatus.PASS, "Enter Card Number", "Card Number Entered successfully");

		CVnumber.sendKeys(cvnumber);
		test.log(LogStatus.PASS, "Enter Card Number", "Card Number Entered successfully");

		Pay.click();
		test.log(LogStatus.PASS, "Click on Continushopping", "Continushopping clicked successfully");

	}

}
