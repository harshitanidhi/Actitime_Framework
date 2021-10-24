package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class ToolXpath {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wlib=new WebDriverUtility();
		wlib.waitUntilPageLoad(driver);
		driver.get("https://demoqa.com/tool-tips");
		WebElement move=driver.findElement(By.id("toolTipButton"));
		wlib.mouseOver(driver, move);
		WebElement tool=driver.findElement(By.xpath("//div[.='You hovered over the Button' and @class='tooltip-inner']"));
		String text=tool.getText();
		driver.findElement(By.id("toolTipTextField")).sendKeys(text);
	

	}

}
