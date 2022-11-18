package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class GlaucomaStatus {
	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();



	public GlaucomaStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="label-no")
	WebElement glaumaStatusAsNo;
	@FindBy(id = "next-button")
	WebElement next10;
	
	public void StatusOfGlauma()
	{
		gu.clickOnTheElement(glaumaStatusAsNo);
		gu.clickOnTheElement(next10);
	}
	

}
