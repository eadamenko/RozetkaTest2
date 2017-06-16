package rozetka.com;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import rozetka.com.factory.applogicDrv.ApplicationManager;
import rozetka.com.factory.applogicDrv.ApplicationManagerDrv;
import ru.stqa.selenium.factory.WebDriverPool;

import rozetka.com.util.PropertyLoader;

/**
 * Base class for TestNG-based test classes
 */
public class TestBase {

  protected static ApplicationManager app;
  
  @BeforeSuite(alwaysRun = true)
  public void initTestSuite() throws IOException {
    app = new ApplicationManagerDrv();
  }

  @BeforeMethod
  public void initWebDriver() {
    if(app instanceof ApplicationManagerDrv) {
      ((ApplicationManagerDrv) app).getWebDriver().manage().window().setSize(new Dimension(1400, 1300));
    }
  }

  @AfterSuite(alwaysRun = true)
  public void tearDown() {
    WebDriverPool.DEFAULT.dismissAll();
  }

  }
