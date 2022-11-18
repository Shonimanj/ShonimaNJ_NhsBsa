package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class HomePay {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public HomePay(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="label-yes")
	WebElement homepayAsYes;
	
	@FindBy(id = "next-button")
	WebElement next16;
	
	public void clickOnhomepayAsYes()
	{
		gu.scrollDown(driver);
		gu.clickOnTheElement(homepayAsYes);
		gu.clickOnTheElement(next16);
	}
	
	
}
