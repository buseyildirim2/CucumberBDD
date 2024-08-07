package enersys.steps;

import enersys.pages.AboutUsHomePage;
import enersys.pages.CareersPage;
import enersys.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AboutUsStepDef {

    AboutUsHomePage aboutUsHomePage = new AboutUsHomePage();
    CareersPage careersPage = new CareersPage();

    @Given("User lands on home page {string}")
    public void user_lands_on_home_page(String homePageURL) {

        Driver.getDriver().get(homePageURL);
        aboutUsHomePage.cookiesAcceptAllButtonShowsInTheBeginning.click();

    }
    @When("User clicks {string} button on the navigation bar")
    public void user_clicks_button_on_the_navigation_bar(String pageName) {

        aboutUsHomePage.aboutUsButtonOnTheNavigationBar.click();

    }
    @When("User clicks {string} button")
    public void user_clicks_button(String string) {

        aboutUsHomePage.careersButton.click();

    }
    @Then("User should navigate to the Careers page and verify that page title is {string}")
    public void user_should_navigate_to_the_page(String expectedPageTitle) {

       String actualPageTitle =  Driver.getDriver().getTitle();
        Assert.assertEquals(expectedPageTitle, actualPageTitle);
    }

    @Then("Verify that page header is {string}")
    public void verify_that_page_header_is(String expectedPageHeader) {

        String actualPageHeader = careersPage.header.getText();

        Assert.assertEquals(expectedPageHeader, actualPageHeader);


    }
}
