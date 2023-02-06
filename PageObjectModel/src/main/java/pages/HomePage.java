package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.UtilityClass;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void printTitle()
	{
		
	driver.getTitle()	;
	}
public boolean isLogoDisplayed()
{
	WebElement element=driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
	boolean a=element.isDisplayed();
	return a;
}
public List<String> printTitles(String xpath)
{
	UtilityClass utilityclass=new UtilityClass(driver);
	
	return utilityclass.getTextOfElements(xpath);
}
}
