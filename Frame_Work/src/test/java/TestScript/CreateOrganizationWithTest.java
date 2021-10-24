package TestScript;

import org.openqa.selenium.WebDriver;
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

public class CreateOrganizationWithTest extends BaseClass{
	//WebDriver driver;
	@Test
	public void OrganisationTest() throws Throwable 
	{
		FileUtility flib=new FileUtility();
		ExcelUtility elib=new ExcelUtility();
		JavaUtility jlib=new JavaUtility();
		WebDriverUtility wlib=new WebDriverUtility();
		String orgName=elib.getExcelData("sheet1", 1, 2)+"_"+jlib.getRandomData();
		Home hp= new Home(driver);
		hp.getOrganizationLnk().click();
		//Org page
		Organizations op=new Organizations(driver);
		op.getCreateOrgImg().click();
		// create org
		CreateNewOrganization cnop=new CreateNewOrganization(driver);
		cnop.createOrg(orgName);
		//Org details
		OrganizationInfo oninfo=new OrganizationInfo(driver);
		wlib.waitForElementVisibility(driver, oninfo.getSuccesfullMsg());
		String actSuchMsg=oninfo.getSuccesfullMsg().getText();
		/*if(actSuchMsg.contains(orgName)) {
	System.out.println("org is created successfully==>Pass");
}
else {
	System.out.println("fail");
}
		 */

	}




}
