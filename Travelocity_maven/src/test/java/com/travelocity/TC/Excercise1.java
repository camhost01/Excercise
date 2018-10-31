package com.travelocity.TC;

import java.util.Calendar;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.travelocity.base.ConfigBase;

public class Excercise1 extends ConfigBase{
	Calendar c1 = Calendar.getInstance();
	String day;
	
	@BeforeMethod
	public void before()
	{
		init();
	}
	
	@Test
	public void ex1()
	{
		day=Integer.toString(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(day);
	}
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
}
