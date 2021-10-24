package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
@FindBy(name="user_name")
private WebElement userNameEdt;

public void setUserNameEdt(WebElement userNameEdt) {
	this.userNameEdt = userNameEdt;
}
@FindBy(name="user_password")
private WebElement userPasswordEdt;
@FindBy(id="submitButton")
private WebElement loginBtn;
public WebElement getUserNameEdt() {
	return userNameEdt;
	
}
public WebElement getUserPasswordEdt() {
	return userPasswordEdt;
}
public WebElement getLoginBtn() {
	return loginBtn;
}
public void LoginToApp(String USERNAME,String PASSWORD) {
	userNameEdt.sendKeys(USERNAME);
	userPasswordEdt.sendKeys(PASSWORD);
	loginBtn.click();
}
}
