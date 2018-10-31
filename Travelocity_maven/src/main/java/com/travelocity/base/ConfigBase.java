package com.travelocity.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigBase {
	public static WebDriver driver;
	public static WebDriverWait esperar;
	private String navegador="chrome"; //pasar por parametros en el xml
	
	public void init()
	{
		if(navegador.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Users/stree/Documents/Eclipse/Complementos/geckodriver-v0.21.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(navegador.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Users/stree/Documents/Eclipse/Complementos/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(navegador.equals("IE"))
		{
			
			System.setProperty("webdriver.ie.driver", "C:/Users/stree/Documents/Eclipse/Complementos/IEDriverServer_x64_3.13.0/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		esperar = new WebDriverWait(driver, 5);
		driver.get("https://www.travelocity.com/");
	}
}