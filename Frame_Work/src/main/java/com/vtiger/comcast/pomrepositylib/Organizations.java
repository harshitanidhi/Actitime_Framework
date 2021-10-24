package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class Organizations {
public Organizations(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//img[@title='Create Organization...']")
private WebElement createOrgImg;
public WebElement getCreateOrgImg() {
	return createOrgImg;
}
@FindBy(name="search_text")
private WebElement searchbtn;

@FindBy(name="submit")
private WebElement searchlink;
@FindBy(id="bas_searchfield")
private WebElement selectorgname;
public void selectorgnamewithcontact() {
	WebDriverUtility wblink=new WebDriverUtility();
	wblink.SelectOption(selectorgname, 4);
}
public WebElement getSearchbtn() {
	return searchbtn;
}
public WebElement getSearchlink() {
	return searchlink;
}
public WebElement getSelectorgname() {
	return selectorgname;
}
}