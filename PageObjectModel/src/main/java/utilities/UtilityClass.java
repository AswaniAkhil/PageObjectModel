package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass {
	WebDriver driver;
	public UtilityClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public String get_Title()
	{
		
		return driver.getTitle();
	}
	public String get_TextOfElement(WebElement element)
	{
		return element.getText();
	}
	public boolean is_TextPresent(WebElement element ,String expectedText) {
		String actualtext=element.getText();
		
		return actualtext.equals(expectedText);
	}
	public List<String> getTextOfElements(String xpath)
	{
	List<String>textData=new ArrayList<String>();
	List<WebElement>elements=driver.findElements(By.xpath(xpath));
	for(WebElement element:elements)
	{
		textData.add(element.getText());
	}
	return textData;
	}
	

}
