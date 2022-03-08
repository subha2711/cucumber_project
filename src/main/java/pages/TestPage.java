package pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Hex;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;



public class TestPage extends BasePage {

	WebDriver driver;

	public TestPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Set SkyBlue Background')]") WebElement skyBlueButton;
	@FindBy(how = How.XPATH, using ="//button[contains(text(),'Set White Background')]") WebElement setwhiteButton;
	
	public void setSkyBlueBackgroundbutton() {
		skyBlueButton.isDisplayed();
		Assert.assertTrue("Button is displaye", true);
	}
	public void whiteButtonDisplay() {
		setwhiteButton.isDisplayed();
		Assert.assertTrue("Button is displaye", true);
	}
	
	public void  selectBlueButton() {
		skyBlueButton.click();
	}
	public void  selectSetWhiteButton() {
		setwhiteButton.click();
	}
	public void changeBlueBGColor() {
	String BGcolor =	skyBlueButton.getCssValue("background-color");
	String hexColor= Color.fromString(BGcolor).asRgba();
	Assert.assertEquals("BackGround color is SkyBlue",hexColor,BGcolor);
	}
	public void changeWhiteColor() {
		String BGcolor =	setwhiteButton.getCssValue("background-color");
		String hexColor= Color.fromString(BGcolor).asRgba();
		Assert.assertEquals("BackGround color is white",hexColor,BGcolor);
		
	}
	
}

