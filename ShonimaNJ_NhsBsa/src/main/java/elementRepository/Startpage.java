package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class Startpage {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public Startpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "next-button")
	WebElement startNow;

	public void clickOnStartNow()
	{
		gu.scrollDown(driver);
		ew.explicitWaitMethod(startNow, driver);
		gu.clickOnTheElement(startNow);
	}


}
