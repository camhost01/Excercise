package com.travelocity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.travelocity.Utilities.Util;
import com.travelocity.base.ConfigBase;

public class Results extends ConfigBase{
	
	//RWAIT RESULTS ELEMENTS
	@FindBy(id="homePage")
	WebElement homePage;
	
	@FindBy(id="sortDropdown")
	WebElement FilterList;
	
	//BUTTON SELECT
	 @FindBy(xpath="//button[@type='button' and @class='btn-secondary btn-action t-select-btn']")
	 WebElement BtnSelect;
	String BtnSelectPath="//button[@type='button' and @class='btn-secondary btn-action t-select-btn']";
	
	 @FindBy(xpath="//button[@class='btn-secondary btn-action t-select-btn btn disabled']")
	 WebElement btnDis;
	
	public Results()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean part2()
	{
		Util.CloseAnothScreen();
		waitResults();
		Select s = new Select(FilterList);
		s.selectByIndex(3);
		Util.WaitClickeableElement(BtnSelect);
		Util.ElemetRepeated(BtnSelectPath, 0);
		Util.WaitClickeableElement(BtnSelect);
		Util.scrollScreen(250);
		Util.ElemetRepeated(BtnSelectPath, 3);
		check();
		return true;
	}
	
	public void waitResults()
	{
		Util.WaitAllElement(homePage);
	}
	public void check()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			btnDis.isDisplayed();
			Util.ElemetRepeated(BtnSelectPath, 3);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
