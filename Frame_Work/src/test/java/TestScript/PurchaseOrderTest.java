package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.vtiger.comcast.pomrepositylib.CreateNewPurchaseOrder;
import com.vtiger.comcast.pomrepositylib.CreatePurchaseOrder;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;

public class PurchaseOrderTest extends BaseClass{

	@Test(priority=1)
	public void selectStatusAsApproved() throws Throwable {
   // wlib.waitUntilPageLoad(driver);
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
	@Test(priority=2)
	public void selectStatusAsCreated() throws Throwable {
		wlib.waitUntilPageLoad(driver);	
	Home h=new Home(driver);
	h.getMore().click();
	h.getPurchaseorder().click();
	CreatePurchaseOrder p=new CreatePurchaseOrder(driver);
	p.getCreatepurchaseorder().click();
	CreateNewPurchaseOrder cn=new CreateNewPurchaseOrder(driver);

	WebElement lb1 = cn.getSelectbtn();
	h.SelectOption(lb1, 0);
	WebElement h1 = h.getAdmin();
	h.mouseOver(driver, h1);
	h.getSignoutbtn().click();
	

}
	@Test(priority=3)
	
	public void selectStatusAsDelieverd() throws Throwable {
		wlib.waitUntilPageLoad(driver);
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
	@Test(priority=4)
	public void selectStatusAsCancelled() throws Throwable {
		wlib.waitUntilPageLoad(driver);
	Home h=new Home(driver);
	h.getMore().click();
	h.getPurchaseorder().click();
	CreatePurchaseOrder p=new CreatePurchaseOrder(driver);
	p.getCreatepurchaseorder().click();
	CreateNewPurchaseOrder cn=new CreateNewPurchaseOrder(driver);

	WebElement lb1 = cn.getSelectbtn();
	h.SelectOption(lb1, 3);
	WebElement h1 = h.getAdmin();
	h.mouseOver(driver, h1);
	h.getSignoutbtn().click();
	
}
	@Test(priority=5)
	public void selectStatusAsRecieved() throws Throwable {
		wlib.waitUntilPageLoad(driver);
	Home h=new Home(driver);
	h.getMore().click();
	h.getPurchaseorder().click();
	CreatePurchaseOrder p=new CreatePurchaseOrder(driver);
	p.getCreatepurchaseorder().click();
	CreateNewPurchaseOrder cn=new CreateNewPurchaseOrder(driver);

	WebElement lb1 = cn.getSelectbtn();
	h.SelectOption(lb1, 4);
	WebElement h1 = h.getAdmin();
	h.mouseOver(driver, h1);
	h.getSignoutbtn().click();
	
}
}
