package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav extends AbstractClass {
    private WebDriver driver;

    public leftNav() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "fuse-navigation .group-items > .nav-item:nth-child(1)")
    private WebElement dropdownSetup;

    @FindBy(xpath = "(//span[contains(text(),'Parameters')])[1]")
    private WebElement dropdownParameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement buttonCountries;

    @FindBy(xpath = "//span[contains(text(),'Citizenship')]")
    private WebElement buttonCitizenship;

    public void clickondropdownSetup() {
        clickFunction(dropdownSetup);
    }

    public void clickondropdownParameters() {
        clickFunction(dropdownParameters);
    }

    public void clickonbuttonCountries() {
        clickFunction(buttonCountries);

    }

    public void clickbuttonCitizenship() {
        clickFunction(buttonCitizenship);
    }

    //    return the current websiteURL
    public String getURL() {
        String url = driver.getCurrentUrl();
        return url;

    }
}