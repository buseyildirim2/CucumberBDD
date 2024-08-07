package enersys.pages;

import enersys.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class NavigationBar {

    @FindBy(id = "onetrust-accept-btn-handler")
    public WebElement cookiesAcceptAllButtonShowsInTheBeginning;

    @FindBy(xpath = "//button[text()='ABOUT US']")
    public WebElement aboutUsButtonOnTheNavigationBar;

    public WebElement navigationBarElementMainMenu(String str){
        return Driver.getDriver().findElement(By.xpath("//div[@class='nav-items main-header__menu-link--links']//button[text()='"+str+"']"));
    }




}
