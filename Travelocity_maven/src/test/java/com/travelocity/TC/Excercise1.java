package com.travelocity.TC;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.travelocity.Utilities.Util;
import com.travelocity.base.ConfigBase;
import com.travelocity.pages.Home;
import com.travelocity.pages.Reserv;
import com.travelocity.pages.Results;

public class Excercise1 extends ConfigBase{
	Home home;
	Results results;
	Reserv reserv;
	Util ut;
	@BeforeMethod
	public void before()
	{
		init();
		home = new Home();
		results = new Results();
		reserv = new Reserv();
		ut = new Util();
	}
	
	@Test
	public void ex1()
	{
		assertTrue(home.part1());
		assertTrue(results.part2());
		assertTrue(reserv.part3());
	}
	
	@AfterMethod
	public void end()
	{
		driver.quit();
	}
}
