package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.BaseClass;

public class CreateNewOrganization extends BaseClass {
public CreateNewOrganization(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(name="accountname")
private WebElement orgNameEdt;

public WebElement getOrgNameEdt() {
	return orgNameEdt;
}
public WebElement getSaveBtn() {
	return saveBtn;
}
@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;
public void createOrg(String orgName) throws Throwable {
	
	orgNameEdt.sendKeys(orgName);
	saveBtn.click();
}
}
