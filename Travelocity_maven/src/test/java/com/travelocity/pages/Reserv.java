package com.travelocity.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travelocity.Utilities.Util;
import com.travelocity.base.ConfigBase;

public class Reserv extends ConfigBase{
	
	//RESULT RESERVATIONS - WAIT
	
	@FindBy(xpath="//body[@data-pageid='page.Flight.Ratedetails']")
	WebElement LastPage;
	
	
	@FindBy(id="bookButton")
	WebElement BtnContBooking;
	
	//AFTER CLICK CONTINUE BOOKING
	@FindBy(xpath="//fieldset[@class='allTravelerDetails']")
	WebElement ResultEnd;
	
	public Reserv()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean part3()
	{
		switchAnotScreen();
		return true;
	}
	
	public void WaitRes()
	{
		Util.WaitAllElement(LastPage);
	}
	
	public boolean switchAnotScreen()
	{
		String CurrentWindow = null,NewWindow;
		Set<String>Paginas=driver.getWindowHandles();
		Iterator<String> I1= Paginas.iterator();
		while(I1.hasNext())
			{
				CurrentWindow = I1.next();
				NewWindow = I1.next();
				driver.switchTo().window(NewWindow);
				WaitRes();
				BtnContBooking.click();
				Util.WaitAllElement(ResultEnd);
			}
			driver.switchTo().window(CurrentWindow);
		return true;
	}
	
	
}
