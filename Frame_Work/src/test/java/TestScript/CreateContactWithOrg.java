package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;

public class CreateContactWithOrg {
	public static void main(String[] args) throws Throwable {
		/*create Objects*/
		ExcelUtility elib=new ExcelUtility();
		FileUtility flib=new FileUtility();
		JavaUtility jlib=new JavaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		WebDriver driver=null;
		/*read common data*/
	
		String BROWSER=flib.getPropertyKeyValue("browser");
		String URL=flib.getPropertyKeyValue("url");
		String USERNAME=flib.getPropertyKeyValue("username");
		String PASSWORD=flib.getPropertyKeyValue("password");
		/*read test data*/
		String orgName=elib.getExcelData("sheet1", 4, 2)+"_"+jlib.getRandomData();
		String contactName=elib.getExcelData("sheet1", 4, 3);
		if(BROWSER.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("ie")) {
			driver=new InternetExplorerDriver();
			
		}
		else {
			driver=new ChromeDriver();
		}
		wlib.waitUntilPageLoad(driver);
		driver.get(URL);
		Login lp=new Login(driver);
		lp.LoginToApp(USERNAME, PASSWORD);
		Home hp=new Home(driver);
		

}
}