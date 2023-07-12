package com.reusable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.library;





public class seleniumutility extends library {
	public seleniumutility(WebDriver driver) {
		this.driver=driver;
	}
	public void EnterValue(WebElement Element, String value) {
		
		Element.sendKeys(value);
	}
	public void doClick(WebElement Element) {
		Element.click();
		
	}
	public void getTitle() {
		
		driver.getTitle();
	}
	
	public void  Screenshot(String path) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(path);
		FileUtils.copyFile(source, target);
	}
	public void Movetoelement(WebElement Element) {
		Actions act=new Actions(driver);
		act.moveToElement(Element).click().build().perform();
		
	}
	public void Scrolldown(WebElement Element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",Element);
		
		
	}
	public void dropdown(WebElement Element, String value) {
		Select drp=new Select(Element);
		drp.selectByValue(value);
	}
	public void mousehover(WebElement Element) {
		Actions act=new Actions(driver);
		act.moveToElement(Element).build().perform();
				
	}
}
