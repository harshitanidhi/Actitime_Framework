package com.crm.vtiger.GenericUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;

public class BaseClass {
public static WebDriver staticDriver;
public DataBaseUtility dlib=new DataBaseUtility();
public FileUtility flib=new FileUtility();
public WebDriverUtility wlib=new WebDriverUtility();
public ExcelUtility elib=new ExcelUtility();
public JavaUtility jlib=new JavaUtility();
public WebDriver driver;
@BeforeSuite(groups= {"smoketest","regression"})
public void connectDB() throws Throwable
{
	//dLib.connectToDB();
	System.out.println("========DB connection is sucessfull======");
}
@Parameters(value= {"browser"})//chrome,firefox
@BeforeClass(groups= {"smoke testing","regression"})
public void launchBrowser(@Optional("chrome") String browserValue) throws Throwable
{
	//read data from property file
	//String BROWSER=flib.getPropertyKeyValue("browser");
	String URL=flib.getPropertyKeyValue("url");
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browserValue.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("=======invalid browser name");
	}
	System.out.println("=============browser launch successfull==========");
	wlib.waitUntilPageLoad(driver);
	driver.get(URL);
}
@BeforeMethod(groups= {"smoke testing"})
public void loginToApp() throws Throwable
{
	//read data from property file
	String USERNAME=flib.getPropertyKeyValue("username");
	String PASSWORD=flib.getPropertyKeyValue("password");
	//login to app
	Login lp=new Login(driver);
lp.LoginToApp(USERNAME, PASSWORD);
System.out.println("========login successfull=======");
	
}
@AfterMethod(groups= {"smoke testing"})
public void logoutOfApp()
{
	//sign out of home page
	Home hp=new Home(driver);
	hp.signOut(driver);
	System.out.println("=============sign out successfull=========");
}
@AfterClass(groups= {"smoke testing"})
public void closeBrowser()
{
	driver.close();
	System.out.println("==========browser closed sucessfully====");
}
@AfterSuite
public void closeDB() throws Throwable
{
	//dLib.closeDB();
	System.out.println("=======db connection is closed sucessfully======");
}
}
