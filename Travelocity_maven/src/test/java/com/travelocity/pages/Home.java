package com.travelocity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travelocity.Utilities.Util;
import com.travelocity.base.ConfigBase;

public class Home extends ConfigBase{
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement OptionFly;

	//FLY OPTIONS
	@FindBy(id="flight-origin-hp-flight")
	WebElement Flyfrom;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement Flydestination;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement Flystart;
	
	@FindBy(id="flight-returning-hp-flight")
	WebElement Flyreturn;
	
	@FindBy(id="flight-adults-hp-flight")
	WebElement adults;
	
	@FindBy(id="flight-children-hp-flight")
	WebElement children;
	
	@FindBy(id="flight-add-hotel-checkbox-hp-flight")
	WebElement Addhotel;
	
	@FindBy(id="flight-add-car-checkbox-hp-flight")
	WebElement Addcar;

	@FindBy(xpath="//button[@data-gcw-change-submit-text='Search']/span[contains(text(),'Search')]")
	WebElement Btnsearch;
	
	//INSERT DATA FLY
	@FindBy(id="typeheadDataPlain")
	WebElement displayOp;
	@FindBy(id="aria-option-0")
	WebElement Opselect;
	
	//ARROW NEXT DATEPICKER
	@FindBy(xpath="//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
	WebElement ArrowNext;
	//BUTTON SEARCH
	@FindBy(xpath="//button[@type='submit' and @class='btn-primary btn-action gcw-submit ']")
	WebElement BtnSearch;
	
	public Home()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean part1()
	{
		String pathbtnSearch="//button[@type='submit' and @class='btn-primary btn-action gcw-submit ']";
		OptionFly.click();
		AddFly();
		AddDeparture();
		Util.ElemetRepeated(pathbtnSearch, 0);
		return true;
	}
	
	public void AddFly()
	{
		Flyfrom.click();
		Flyfrom.sendKeys("LAS");
		Util.WaitElement(Opselect);
		Opselect.click();
		Flydestination.click();
		Flydestination.sendKeys("LAX");
		Util.WaitElement(Opselect);
		Opselect.click();
	}
	
	public void AddDeparture()
	{
		Flystart.click();
		ArrowNext.click();
		if(Month.equals("12"))
		{
			Month="0";
		}else if(Month.equals("13"))
		{
			Month="1";
			if(Day.equals("29")||Day.equals("30")||Day.equals("31"))
			{
				Day="28";
			}
		}
		String pathFlyinit ="//button[@data-month='"+Month+"' and @data-day='"+Day+"']";
		WebElement dateinit = driver.findElement(By.xpath(pathFlyinit));
		dateinit.click();
		Flyreturn.click();
		String pathFlyreturn ="//button[@data-month='"+Month+"' and @data-day='"+Day2+"']";
		WebElement datereturn = driver.findElement(By.xpath(pathFlyreturn));
		datereturn.click();		
	}

}

