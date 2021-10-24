package TestScript;

import java.nio.channels.Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;
import com.vtiger.comcast.pomrepositylib.CreateNewPurchaseOrder;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;
import com.vtiger.comcast.pomrepositylib.CreatePurchaseOrder;

public class TC_16SelectStatusAsApproved {

@Test
public void createPurchaseOrder() throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	
	FileUtility fu=new FileUtility();
	Login l=new Login(driver);
	l.LoginToApp("admin", "admin");
Home h=new Home(driver);
h.getMore().click();
h.getPurchaseorder().click();
CreatePurchaseOrder p=new CreatePurchaseOrder(driver);
p.getCreatepurchaseorder().click();
CreateNewPurchaseOrder cn=new CreateNewPurchaseOrder(driver);

WebElement lb1 = cn.getSelectbtn();
h.SelectOption(lb1, 1);
WebElement h1 = h.getAdmin();
h.mouseOver(driver, h1);
h.getSignoutbtn().click();
}
}