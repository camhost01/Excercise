package com.travelocity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.travelocity.base.ConfigBase;

public class Home extends ConfigBase{
	
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
	
	public Home()
	{
		PageFactory.initElements(driver,this);
	}
}
