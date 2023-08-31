package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.JavaScriptExecutor;
import utilities.WaitHelper;

public class AboutUsPage {
	WebDriver driver;
	JavaScriptExecutor js = new JavaScriptExecutor();
	WaitHelper waitHelper = new WaitHelper(driver);

	public AboutUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);

	}
	
	// Click burger menu
		@FindBy(xpath = "//span[@class=\"hamburger-box button-inline-alt__icon\"]")
		WebElement burgerMenu;

		@SuppressWarnings("static-access")
		public void clickBurgerMenu() {
			waitHelper.WaitForElementToBeClickable(driver, burgerMenu, 30);
			js.javaScriptClick(driver, burgerMenu);

		}
		
		// Click about us link
				@FindBy(xpath = "//a[text()=\"About us\"]")
				WebElement aboutUsLink;

				@SuppressWarnings("static-access")
				public void clickAboutUsLink() {
					waitHelper.WaitForElementToBeClickable(driver, aboutUsLink, 30);
					js.javaScriptClick(driver, aboutUsLink);

				}
				
				// Get about us title
				public String getAboutUsPageTitle() {
					return driver.getTitle();
				}


}
