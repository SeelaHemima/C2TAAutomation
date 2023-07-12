package com.baseclass;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class library {
	public WebDriver driver;
	public Properties prop;
public void launchUrl() throws IOException {
	
	FileInputStream input = new FileInputStream("src/test/resources/Properties/app.properties");
	prop=new Properties();
	prop.load(input);
	
   if( prop.getProperty("browser").equalsIgnoreCase("chrome")) {
   
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
   }
   
   else if( prop.getProperty("browser").equalsIgnoreCase("firefox")) {
	   
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	   }
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.navigate().to(prop.getProperty("url"));
	
}

public void teardown() {
	driver.close();
	
}

}
