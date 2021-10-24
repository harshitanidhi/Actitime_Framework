package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class CreateContact extends WebDriverUtility{
	WebDriver driver;
	public CreateContact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="lastname")
	private WebElement lastNameEdt;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLastNameEdt() {
		return lastNameEdt;
	}
	public WebElement getOrgNameLookUpIcon() {
		return orgNameLookUpIcon;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
	private WebElement orgNameLookUpIcon;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	public void createContactWithOrg(String contactName,String orgName) {
lastNameEdt.sendKeys(contactName);
orgNameLookUpIcon.click();
switchToWindow(driver,"Accounts&action");
Organizations op=new Organizations(driver);
op.getSearchbtn().sendKeys(orgName);
op.selectorgnamewithcontact();
op.getSearchlink().click();

}
}
