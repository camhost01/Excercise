package com.travelocity.Utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.travelocity.base.ConfigBase;

public class Util extends ConfigBase{

	public static void WaitElement(WebElement element)
	{
		esperar.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void ElemetRepeated(String dat, int a)
	{
	  List<WebElement> desplegables = driver.findElements(By.xpath(dat));
	  desplegables.get(a).click();
	}
}
