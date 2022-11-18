package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExplicitWait;
import utilities.Generalutilities;

public class DateOfBirth {

	WebDriver driver;
	Generalutilities gu=new Generalutilities();
	ExplicitWait ew=new ExplicitWait();
	public DateOfBirth(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "dob-day")
	WebElement dob;
	@FindBy(id = "dob-month")
	WebElement dom;
	@FindBy(id = "dob-year")
	WebElement doy;
	@FindBy(id = "next-button")
	WebElement next4;

	public void enterDob(String date,String month,String year)
	{
		gu.enterText(dob, date);
		gu.enterText(dom, month);
		gu.enterText(doy, year);
		gu.clickOnTheElement(next4);

	}
}
