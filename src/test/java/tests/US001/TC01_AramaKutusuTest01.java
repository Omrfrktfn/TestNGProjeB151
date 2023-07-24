package tests.US001;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01_AramaKutusuTest01 {


    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(1);
        Page page = new Page();
        page.aramaKutsu.sendKeys("iphone", Keys.ENTER);

        Driver.closeDriver();

        //amazon sayfasina gidilip arama kutusu test edildi.
        //esen bey yeni kodlar ekledi.
    }

}
