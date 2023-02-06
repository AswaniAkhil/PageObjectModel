package executetests;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
	InputFormPage inputformpage;
	@Test
	
	public void verifyMsgIsDisplayed()
	{
		inputformpage=new InputFormPage(driver);
		inputformpage.clickOnInputForm();
		inputformpage.enterMessageInInputForm("hello");
	}

}
