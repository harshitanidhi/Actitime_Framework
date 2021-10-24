package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class Home extends WebDriverUtility {
	WebDriver driver;
	

	@FindBy(xpath="//a[.='More']")
	private WebElement more;
	@FindBy(name="Purchase Order")
	private WebElement purchaseorder;
	@FindBy(xpath="//a[.='Contacts']")
	private WebElement contact;
	
	public WebElement getContact() {
		return contact;
	}
	@FindBy(xpath="//img[@src=\"themes/softed/images/btnL3Add.gif\"]")
	private WebElement create;
	
	@FindBy(xpath="(//img[@style='padding: 0px;padding-left:5px'])[1]")
	private WebElement admin;
	@FindBy(linkText="Organizations")
	private WebElement organizationLnk;
	
	public WebElement getOrganizationLnk() {
		return organizationLnk;
	}
	public WebElement getProductLnk() {
		return productLnk;
	}
	@FindBy(linkText="Products")
	private WebElement productLnk;
	public WebElement getCreate() {
		return create;
	}
	public WebElement getAdmin() {
		return admin;
	}
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signoutbtn;
	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getMore() {
		return more;
	}
	public WebElement getPurchaseorder() {
		return purchaseorder;
	
	}
	public void homePage(WebDriver driver) {
		WebDriverUtility wb=new WebDriverUtility();
		wb.mouseOver(driver, more);
	}
	public void signOut(WebDriver driver) {
		WebDriverUtility wbc=new WebDriverUtility();
		wbc.mouseOver(driver, signoutbtn);
		signoutbtn.click();
	}
	
}

