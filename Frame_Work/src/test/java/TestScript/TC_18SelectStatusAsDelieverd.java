package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.FileUtility;
import com.vtiger.comcast.pomrepositylib.CreateNewPurchaseOrder;
import com.vtiger.comcast.pomrepositylib.CreatePurchaseOrder;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;

public class TC_18SelectStatusAsDelieverd {
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
	h.SelectOption(lb1, 2);
	WebElement h1 = h.getAdmin();
	h.mouseOver(driver, h1);
	h.getSignoutbtn().click();

}
}