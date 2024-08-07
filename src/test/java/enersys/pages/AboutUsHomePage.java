package enersys.pages;

import enersys.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUsHomePage extends NavigationBar{

    public AboutUsHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='https://www.enersys.com/en/careers/']")
    public WebElement careersButton;

}
