package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class KenAnsonPage {

	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public KenAnsonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}

	// about Ken Anson tab
	@FindBy(xpath = "//a[@class=\"bttn bttn-contrast\"][text()=\"About Mr Anson\"]")
	WebElement kenAnsonTab;

	public boolean isKenAnsonTabDisplayed()

	{
		try {
			return (kenAnsonTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Get Ken Anson title
	public String getKenAnsonPageTitle() {
		return driver.getTitle();
	}

	// request an appointment tab
	@FindBy(xpath = "//a[@class=\"site-header__bttn bttn bttn-primary\"][@href=\"/get-in-touch\"]")
	WebElement requestAnAppointmentTab;

	public boolean isRequestAnAppointmentTabDisplayed()

	{
		try {
			return (requestAnAppointmentTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Diagnostics tab
	@FindBy(xpath = "//a[@href=\"/diagnostics\"][@class=\"bttn bttn-secondary bttn-primary-diff\"]")
	WebElement diagnosticsTab;

	public boolean isDiagnosticsTabDisplayed()

	{
		try {
			return (diagnosticsTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Conditions tab
	@FindBy(xpath = "//a[@href=\"/conditions\"][@class=\"bttn bttn-secondary bttn-primary-diff\"]")
	WebElement conditionsTab;

	public boolean isConditionsTabDisplayed()

	{
		try {
			return (conditionsTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Treatments tab
	@FindBy(xpath = "//a[@href=\"/treatments\"][@class=\"bttn bttn-secondary bttn-primary-diff\"]")
	WebElement treatmentsTab;

	public boolean isTreatmentsTabDisplayed()

	{
		try {
			return (treatmentsTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Reviews tab
	@FindBy(xpath = "//a[@href=\"https://finder.hcahealthcare.co.uk/hca/specialist/mr_ken_anson\"][@class=\"bttn bttn-secondary\"]")
	WebElement reviewsTab;

	public boolean isReviewsTabDisplayed()

	{
		try {
			return (reviewsTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}

	// Contact us tab
	@FindBy(xpath = "//a[text()=\"Contact us\"]")
	WebElement contactUsTab;

	public boolean isContactUsDisplayed()

	{
		try {
			return (contactUsTab.isDisplayed());
		} catch (Exception e) {
			return (false);
		}

	}
	
	// Footer count
		public int getFooterCount() {
			return driver.findElements(By.xpath("//footer[@class=\"footer\"]//li")).size();
		}

}
