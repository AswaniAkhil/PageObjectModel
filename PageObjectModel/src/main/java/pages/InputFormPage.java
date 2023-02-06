package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	WebDriver driver;
	By inputForm=By.xpath("(//a[@class='nav-link'])[2]");
	By enterMessage=By.xpath("(//input[@class='form-control'])[1]");
	public InputFormPage( WebDriver driver)
	{
		this.driver=driver;
	}
	 public void clickOnInputForm()
	 {
		 WebElement inputformelement =driver.findElement(inputForm);
		inputformelement.click();
	 }
	 public void enterMessageInInputForm(String s)
	 {
		 WebElement entermessage1=driver.findElement(enterMessage);
		 entermessage1.sendKeys(s);
		 
	
	 }
}
