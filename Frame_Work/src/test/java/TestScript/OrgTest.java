package TestScript;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;
import com.vtiger.comcast.pomrepositylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositylib.Home;
import com.vtiger.comcast.pomrepositylib.Login;
import com.vtiger.comcast.pomrepositylib.OrganizationInfo;
import com.vtiger.comcast.pomrepositylib.Organizations;
@Listeners(com.crm.vtiger.GenericUtils.ListnerImpl.class)
public class OrgTest extends BaseClass{
	@Test
	public void OrganisationTest() throws Throwable {
		
		Home hp=new Home(driver);
		Assert.fail();
hp.getOrganizationLnk().click();	
Organizations op=new Organizations(driver);
op.getCreateOrgImg().click();
CreateNewOrganization cnop=new CreateNewOrganization(driver);
cnop.createOrg("TY");
OrganizationInfo oninfo=new OrganizationInfo(driver);
wlib.waitForElementVisibility(driver, oninfo.getSuccesfullMsg());
String actSuchMsg=oninfo.getSuccesfullMsg().getText();
if(actSuchMsg.contains("TY")) {
	System.out.println("org is created successfully==>Pass");
}
else {
	System.out.println("fail");
}
hp.getSignoutbtn();
driver.close();
	}

}
