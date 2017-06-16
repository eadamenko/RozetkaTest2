package rozetka.com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Frost on 14.06.2017.
 */
public class PageManager {

    private WebDriver driver;

    public HomePage homePage;

    public PageManager(WebDriver driver) {
        this.driver = driver;

        homePage = initElements(new HomePage(this));
    }

    private <T extends Page> T initElements(T page) {
        PageFactory.initElements(driver, page);
        return page;
    }

    WebDriver getWebDriver() {
        return driver;
    }
}
