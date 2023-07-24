package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utilities.Driver;

public class Page {


    public Page() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    //Burada sayfalari belli edin
    //ornegin 10 ile 50 esen ve 50 100 esma gibi


    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutsu;
}
