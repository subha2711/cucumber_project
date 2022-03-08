package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestPage;
import util.BrowserFactory;

public class TestSteps {
WebDriver driver;
TestPage tp;
	@Before
	public void launchBrowser() {
		driver = BrowserFactory.init();
		tp = PageFactory.initElements(driver, TestPage.class);
	}
	
	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String button) throws Throwable {
	tp.setSkyBlueBackgroundbutton();
	tp.whiteButtonDisplay();
	}

	@When("^I click on the button;$")
	public void i_click_on_the_button() throws Throwable {
	    tp.selectBlueButton();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
	   tp.changeBlueBGColor();
	}

	@When("^I click on the button$")
	public void i_click_on_the_button1() throws Throwable {
	   tp.selectSetWhiteButton();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	tp.changeWhiteColor();
	}
@After
public void close() {
	BrowserFactory.tearDown();
}

}
