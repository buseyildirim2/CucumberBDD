package enersys.pages;

import enersys.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersPage extends NavigationBar {

    public CareersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "h1.jumbotronblock__content--title")
    public WebElement header;

}
