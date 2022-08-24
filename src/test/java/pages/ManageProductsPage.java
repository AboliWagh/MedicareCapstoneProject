package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testCases.BaseClass;

public class ManageProductsPage {

	WebDriver driver = BaseClass.driver;

	ExtentTest test = BaseClass.test;

////////////////////Web Elements /////////////////////////////

	@FindBy(xpath = "//a[@href='/medicare/manage/product']")
	WebElement Manageprducts;

	@FindBy(id = "name")
	WebElement ProductName;

	@FindBy(name = "brand")
	WebElement BrandName;

	@FindBy(id = "description")
	WebElement Decription;

	@FindBy(id = "unitPrice")
	WebElement UnitPrice;

	@FindBy(xpath = "//input[@id='quantity']")
	WebElement Quantity;

	@FindBy(id = "file")
	WebElement UploadFile;

	@FindBy(id = "//select[@id='categoryId']")
	WebElement Category;

	@FindBy(xpath = "//input[@type='submit'][1]")
	WebElement SaveButton;

	//@FindBy(xpath = "//a[@href='/medicare/show/all/products']")
	//WebElement ViewProducts;

	@FindBy(xpath = "//a[@href='/medicare/manage/2/product']")
	WebElement EditButton;

	public ManageProductsPage() {

		PageFactory.initElements(driver, this);
	}

	public void Manageprodutfunction(String productnameval, String brandnameval, String descriptionval,
			String unitpriceval, String filepathval) {

		Manageprducts.click();
		test.log(LogStatus.PASS, "Manageprducts", "Manageprducts Clicked Successfully");

		ProductName.sendKeys(productnameval);
		test.log(LogStatus.PASS, "Name", "Name Entered Successfully");

		// setText(elt,text,1); => clear,wait 1 sec,sendekeys
		BrandName.sendKeys(brandnameval);
		test.log(LogStatus.PASS, "BrandName", "BrandName Entered Successfully");

		Decription.sendKeys(descriptionval);
		test.log(LogStatus.PASS, "Decription", "Decription Entered Successfully");
		
		BrandName.clear();
		BrandName.sendKeys(brandnameval);
		test.log(LogStatus.PASS, "BrandName", "BrandName Entered Successfully");

		UnitPrice.clear();
		UnitPrice.sendKeys(unitpriceval);
		test.log(LogStatus.PASS, "UnitPrice", "UnitPrice Entered Successfully");

		Quantity.sendKeys("3");
		test.log(LogStatus.PASS, "Quantity", "Name Entered Successfully");

		UploadFile.sendKeys(filepathval);
		test.log(LogStatus.PASS, "UploadFile", "UploadFile  Successfully");

		SaveButton.click();
	}

	public void EditProductFunction(String newbrandnameval, String newunitpriceval) throws InterruptedException {

		Manageprducts.click();
		Thread.sleep(1000);
		
		EditButton.click();
		Thread.sleep(1000);
		
		BrandName.clear();
		BrandName.sendKeys(newbrandnameval);
		test.log(LogStatus.PASS, "NewBrandName", "NewBrandName Entered Successfully");
		Thread.sleep(1000);
		
		UnitPrice.clear();
		UnitPrice.sendKeys(newunitpriceval);
		test.log(LogStatus.PASS, "NewUnitPrice", "NewUnitPrice Entered Successfully");
		Thread.sleep(1000);
		
		SaveButton.click();

		// Manageprducts.click();
		// DeactivateSlider.click();
	}
}
