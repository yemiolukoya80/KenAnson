package stepDefinitions;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.KenAnsonPage;
import org.junit.Assert;

public class KenAnsonStep {

	KenAnsonPage kenAnsonPage = new KenAnsonPage(DriverFactory.getDriver());
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		DriverFactory.getDriver().get("https://www.kenansonurology.com/");

	}

	@Given("page title is Home | Ken Anson")
	public void page_title_is_home_ken_anson() {
		Assert.assertEquals(kenAnsonPage.getKenAnsonPageTitle(), "Home | Ken Anson");
	}

	@Given("there is a Request an appointment tab")
	public void there_is_a_request_an_appointment_tab() {

		Assert.assertTrue(kenAnsonPage.isRequestAnAppointmentTabDisplayed());

	}

	@Given("About Mr Anson tab")
	public void about_mr_anson_tab() {
		Assert.assertTrue(kenAnsonPage.isKenAnsonTabDisplayed());
	}

	@Given("Diagnostics tab")
	public void diagnostics_tab() {
		Assert.assertTrue(kenAnsonPage.isDiagnosticsTabDisplayed());

	}

	@Given("Conditions tab")
	public void conditions_tab() {
		Assert.assertTrue(kenAnsonPage.isConditionsTabDisplayed());

	}

	@Given("Read more reviews tab")
	public void read_more_reviews_tab() {
		Assert.assertTrue(kenAnsonPage.isReviewsTabDisplayed());

	}

	@Given("Contact us")
	public void contact_us() {
		Assert.assertTrue(kenAnsonPage.isContactUsDisplayed());

	}
	
	
	@Given("Treatments tab")
	public void treatments_tab() {
		Assert.assertTrue(kenAnsonPage.isTreatmentsTabDisplayed());

	    
	}
	@Given("{int} footer links")
	public void footer_links(Integer kenAnsonFooterLink) {
		Assert.assertTrue(kenAnsonPage.getFooterCount()==kenAnsonFooterLink);
	   
	}




}
