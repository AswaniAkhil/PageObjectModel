package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class DatePickersPage {
	WebDriver driver;
	UtilityClass utilityclass;
	@FindBy(xpath="(//a[@class='nav-link'])[3]")
	WebElement datepicker;
	@FindBy(xpath="//input[@class='form-control datepicker']")
	WebElement selectdate;
	@FindBy(xpath="(//th[@class='datepicker-switch'])[1]")
	WebElement monthandyear;
	@FindBy(xpath="//th[@class='prev']")
	WebElement previous;
	@FindBy(xpath="//th[@class='next']")
	WebElement next;
	
	
	public DatePickersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnDatePicker()
	{
		datepicker.click();
	}
	public void selectDate(String date)
	{
		selectdate.click();
		String split[]=date.split("-");
		//covert string to int
		int m=Integer.parseInt(split[1]);
		
		String month="";
		switch (m) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
	}
		String day=split[0];
		String year=split[2];
		int y=Integer.parseInt(year);
		System.out.println(year+" "+month+" "+day);
		String month_year=month+" "+year;
		while(true)
		{
			String actualmonthtext=monthandyear.getText();
			System.out.println(actualmonthtext);
			if(actualmonthtext.equals(month_year))
			{
				break;
			}
			else if(m>=1 && y>=2023)
			{
			next.click();
			}
				
			else
			{
				previous.click();
			}
			
		}
		driver.findElement(By.xpath("//td[@class='day' and text()='"+day+"']")).click();
		
	}
	
}
