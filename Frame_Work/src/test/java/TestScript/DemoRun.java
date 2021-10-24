package TestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;

@Listeners(com.crm.vtiger.GenericUtils.ListnerImpl.class)
public class DemoRun extends BaseClass{
	@Test
	public void run() {
		System.out.println("run");
	}

}
