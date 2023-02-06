package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class TablePage {
	WebDriver driver;
	UtilityClass utilityclass;
	int i;
	
	@FindBy(xpath = "(//a[@class='nav-link'])[4]")
	WebElement table;
	@FindBy(xpath ="//table[@id='dtBasicExample']//tbody//tr[1]//td[1]")
	WebElement personname;
	
	public TablePage(WebDriver driver)
	{
		this.driver=driver;
		
				//access webelements by pagefactory we use this
		PageFactory.initElements(driver,this);
	}
	public void clickOnTable()
	{
		
		table.click();
		
	}
	public void printtext()
	{
		utilityclass=new UtilityClass(driver);
		String s=utilityclass.get_TextOfElement(personname);
		System.out.println(s);
		
		
	}
	public boolean is_PersonPresent()
	{
		utilityclass=new UtilityClass(driver);
		return utilityclass.is_TextPresent(personname,"Tiger Nixon");
}
	public List<String> printNames(String xpath)
	{
		utilityclass=new UtilityClass(driver);
		
		return utilityclass.getTextOfElements(xpath);
	}
	public String get_OfficeOfPerson(String personName)
	{
		utilityclass=new UtilityClass(driver);
		List<String>names= new ArrayList<String>();
		names=utilityclass.getTextOfElements("//table[@id='dtBasicExample']//tbody//tr//td[1]");
		for( i=0;i<names.size();i++)
		{
		if(personName.equals(names.get(i)))
				{
			i++;
			break;
				}
		}
		WebElement officeText=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[3]"));
		
		return officeText.getText();
		
		
	}

}
