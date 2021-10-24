package TestScript;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.comcast.pomrepositylib.CreateNewPurchaseOrder;
import com.vtiger.comcast.pomrepositylib.CreatePurchaseOrder;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;

public class LoginP {
	@Test
	public void loginp() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login l=new Login(driver);
		Home h=new Home(driver);
		h.homePage(driver);
		h.getPurchaseorder().click();
		CreatePurchaseOrder cp=new CreatePurchaseOrder(driver);
		cp.getCreatepurchaseorder().click();
		CreateNewPurchaseOrder c=new CreateNewPurchaseOrder(driver);
		c.getSelectbtn();
		Thread.sleep(1000);
		h.signOut(driver);
	}

}
