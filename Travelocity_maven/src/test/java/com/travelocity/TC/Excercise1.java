package com.travelocity.TC;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.travelocity.Utilities.Util;
import com.travelocity.base.ConfigBase;
import com.travelocity.pages.Home;

public class Excercise1 extends ConfigBase{
	Home home;
	Util ut;
	@BeforeMethod
	public void before()
	{
		init();
		home = new Home();
		ut = new Util();
	}
	
	@Test
	public void ex1()
	{
		assertTrue(home.part1());
	}
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
}
