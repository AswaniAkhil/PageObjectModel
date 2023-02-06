package executetests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass{
	TablePage tablepage;
	@Test
	public void verifyText()
	{
		tablepage=new TablePage(driver);
		
		tablepage.clickOnTable();
		tablepage.printtext();
		List<String>names=new ArrayList<String>();
		names=tablepage.printNames("//table[@id='dtBasicExample']//tbody//tr//td[1]");
		Assert.assertTrue(tablepage.is_PersonPresent());
		System.out.println(names);
		System.out.println(tablepage.get_OfficeOfPerson("Cedric Kelly"));
		
	}

}
