package com.travelocity.pages;

import org.openqa.selenium.By;
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
	@FindBy(xpath="//button[@type='button' and @data-test-id='select-button']")
	WebElement BtnSelect;
	
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
		delay(2000);
		SelecClick(1);
		delay(2000);
		Util.scrollScreen(500);
		SelecClick(5);
		return true;
	}
	
	public void waitResults()
	{
		Util.WaitAllElement(homePage);
	}
	public void SelecClick(int a)
	{
		String BtnSelectPath="(//button[@type='button' and @data-test-id='select-button'])['"+a+"']";
		WebElement btnSelect = driver.findElement(By.xpath(BtnSelectPath));
		btnSelect.click();
		/*try {
			btnDis.isEnabled();
			btnSelect.click();
		} catch (Exception e) {
			System.out.println("X");
		}		*/
	}
}
