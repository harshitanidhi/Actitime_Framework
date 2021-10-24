package com.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePurchaseOrder {
	public  CreatePurchaseOrder(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement createpurchaseorder;
	public WebElement getCreatepurchaseorder() {
		return createpurchaseorder;
	
	}
	

}
