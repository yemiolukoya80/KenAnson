package stepDefinitions;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.AboutUsPage;

public class AboutUsStep {
	
	AboutUsPage aboutUsPage = new AboutUsPage(DriverFactory.getDriver());

	@When("click burger menu")
	public void click_burger_menu() {
		aboutUsPage.clickBurgerMenu();
	}
	@When("click about us")
	public void click_about_us() {
		aboutUsPage.clickAboutUsLink();
	}
	@Then("page title should be About | Ken Anson")
	public void page_title_should_be_about_ken_anson() {
		Assert.assertEquals(aboutUsPage.getAboutUsPageTitle(), "About | Ken Anson");
	  
	}




}
