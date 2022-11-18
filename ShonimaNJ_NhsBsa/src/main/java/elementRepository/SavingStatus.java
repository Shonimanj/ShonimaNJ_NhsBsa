package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class SavingStatus {

	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public SavingStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id ="label-no" )
	WebElement careHomeasNo;
	
	@FindBy(id="next-button")
	WebElement next12;
	
	public void savingStatusAsNo()
	{
		gu.clickOnTheElement(careHomeasNo);
		gu.clickOnTheElement(next12);
	}
	
	
}
