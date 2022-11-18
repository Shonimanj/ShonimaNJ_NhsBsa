package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generalutilities {
	
	public void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");

	}
	public void clickOnTheElement(WebElement element)
	{
		element.click();
	}
	public void enterText(WebElement element,String text)
	{
		element.sendKeys(String.valueOf(text));
	}

}
