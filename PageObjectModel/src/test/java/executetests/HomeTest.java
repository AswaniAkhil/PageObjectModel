package executetests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass {
	HomePage homepage;
	@Test
	public void verifyHomeLogo()
	{
		homepage=new HomePage(driver);
		
		Assert.assertTrue(homepage.isLogoDisplayed());
		
	}
	@Test
	public void printHomePageTitles()
	{
		homepage=new HomePage(driver);
		List<String>titles=new ArrayList<String>();
		titles=homepage.printTitles("//a[@class='nav-link']");
		System.out.println(titles);
	}
}