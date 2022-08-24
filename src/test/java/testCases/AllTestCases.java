package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageProductsPage;
import pages.ShoppingPage;
import pages.SignUpPage;

public class AllTestCases extends BaseClass {

////////// TEST CASE 1 ----- User LOGIN SUCESS TEST/////////////

	@Test
	@Parameters({ "Param1", "Param2" })
	public void UserLoginparameterizedTest(String UserNameVal, String PasswordVal) {
		test = report.startTest("UserLoginparameterizedTest");
		LoginPage storelogin = new LoginPage();
		storelogin.LoginFunction(UserNameVal, PasswordVal);

		report.endTest(test);

	}

	/////////// TEST CASE 2 Admin login Parameterized Test ///////////////////////

	
	  @Test
	  
	  public void AdminLoginTest() { 
		  test = report.startTest("Adminloginest");
	 
	  LoginPage login = new LoginPage(); login.LoginFunction("vk@gmail.com",
	  "admin");
	  
	  report.endTest(test); 
	  
	  }
	  
	  
	  ////////////////////////TEST CASE 3 Add New Product Function //////////////////////
	  @Test
	  public void AddNewProductTest() {
		  test = report.startTest("AddNewProductTest"); 
		  LoginPage login = new LoginPage(); 
			 login.LoginFunction("vk@gmail.com","admin");
	
	  ManageProductsPage productdetails = new ManageProductsPage();
	  productdetails.Manageprodutfunction("New PanadolExtra", "Rama Farma Co.",
	  "Effective Pain Relief","20.00", "C:\\Users\\aboli_xzqs16p\\Downloads\\Panadol.jfif");
	 
	  report.endTest(test); 
	  }
	  
	 
	  /////////////////////////TEST CASE 4 Edit Products///////////////////////////////
	 @Test
	  public void EditProductTest() throws InterruptedException {
		 test = report.startTest("EditProductTest"); 
		 LoginPage login = new LoginPage(); 
		 login.LoginFunction("vk@gmail.com","admin");
	  ManageProductsPage editedproduct = new ManageProductsPage();
	  editedproduct.EditProductFunction("Cipla Company","40");
	 
	  report.endTest(test); 
	  
	 }
	////////// TEST CASE 5 Add to cart Test //////////////////

	
	/*  @Test public void AddToCartTest() throws InterruptedException { test =
	  report.startTest("AddToCartTest");
	  
	  LoginPage login = new LoginPage(); login.LoginFunction("kn@gmail.com",
	  "12345");
	  
	  Thread.sleep(2000);
	  
	  ShoppingPage PaymentDetail = new ShoppingPage();
	 PaymentDetail.ShoppingFunction("12345678", "11", "22", "123");
	 
	  report.endTest(test);
	  
	 }*/
	 

	//////////// TEST CASE 6 Login Fail Excel data Test ///////////////////////////////////////
	
	  @Test public void ExcelDataTest() { test = report.startTest("ExcelDataTest");
	  
	  String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue(); String
	  PasswordVal = sheet.getRow(1).getCell(1).getStringCellValue();
	  
	  LoginPage login = new LoginPage(); login.LoginFunction(UserNameVal,
	  PasswordVal);
	  
	  report.endTest(test);
	  
	  }
	 

///////////////////////////////////// TEST CASE 7 SignUp as USer Test//////////////////////////////////////////////////

	
	  @Test public void SignUpUserTest() throws InterruptedException {
	 
	 test = report.startTest("SignUpUserTest");
	 
	 SignUpPage firstname = new SignUpPage(); firstname.NewsupplierFunction("Ram452",
	 "david", "R52@yahoo.com", "123456", "Daizy", "Daizy", "Upper Changi",
	  "Punggol", "Tampines", "411041", "Tampines", "Singapore");
	  Thread.sleep(1000);
	  SignUpPage newlogin = new SignUpPage();
	  newlogin.NewsupplierLoginFunction("Rsew52@yahoo.com", "123456");
	 
	 report.endTest(test); }
	 
	 }

