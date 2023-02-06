package executetests;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass{
	DatePickersPage datepicker;
	String date="2-01-2028";
	@Test
	 public void clickDate()
	 {
		 datepicker=new DatePickersPage(driver);
		 datepicker.clickOnDatePicker();
		
		 
	 }
	@Test
	public void selectADate()
	{
		datepicker=new DatePickersPage(driver);
		 datepicker.clickOnDatePicker();
		 datepicker.selectDate(date);
		 
	}
	
	

}
