package com.travelocity.Utilities;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.travelocity.base.ConfigBase;

public class Util extends ConfigBase{

	public static void WaitElement(WebElement element)
	{
		esperar.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void WaitAllElement(WebElement element)
	{
		esperar.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public static void WaitClickeableElement(WebElement element)
	{
		esperar.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void ElemetRepeated(String dat, int a)
	{
	  List<WebElement> desplegables = driver.findElements(By.xpath(dat));
	  desplegables.get(a).click();
	}
	
	public static void CloseAnothScreen()
	{
		String CurrentWindow = null,NewWindow;
		// It will return the parent window name as a String
			 
		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		Set<String>Paginas=driver.getWindowHandles();
		 
		// Now we will iterate using Iterator
		Iterator<String> I1= Paginas.iterator();
		 
		while(I1.hasNext())
		{
			CurrentWindow = I1.next();
			try {
				NewWindow = I1.next();
				driver.switchTo().window(NewWindow);
				driver.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		driver.switchTo().window(CurrentWindow);
	}
	
	public static void scrollScreen(int var)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, "+var+")", "");
	}
}
