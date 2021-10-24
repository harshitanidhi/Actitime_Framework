package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewPurchaseOrder {
	public CreateNewPurchaseOrder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@value='U']")
private WebElement userbtn;
public WebElement getUserbtn() {
	return userbtn;
}
@FindBy(xpath="//select[@name='postatus']")
private WebElement selectbtn;
public WebElement getSelectbtn() {
	return selectbtn;
}



}
