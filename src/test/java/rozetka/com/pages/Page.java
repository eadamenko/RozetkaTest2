package rozetka.com.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.com.TestBase;
import rozetka.com.util.PropertyLoader;

import java.io.IOException;

/**
 * Abstract class representation of a Page in the UI. Page object pattern
 */
public abstract class Page extends TestBase {

  protected WebDriver driver;
  protected WebDriverWait wait;
  protected static String baseUrl;

  public Page(PageManager pages) {
    driver = pages.getWebDriver();
    wait = new WebDriverWait(driver,20);
    wait.ignoring(StaleElementReferenceException.class);
    try {
      baseUrl = PropertyLoader.loadProperty("site.url");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
