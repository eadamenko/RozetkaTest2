package rozetka.com.factory.applogicDrv;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import rozetka.com.factory.applogic.AppHelper;
import rozetka.com.pages.PageManager;
import rozetka.com.util.PropertyLoader;
import ru.stqa.selenium.factory.WebDriverPool;

import java.io.IOException;

/**
 * Created by Frost on 14.06.2017.
 */
public class ApplicationManagerDrv implements ApplicationManager {

    private AppHelper appHelper;
    protected static String gridHubUrl;
    protected static String baseUrl;
    protected static Capabilities capabilities;
    
    private WebDriver driver;
    private PageManager pages;
    
    public ApplicationManagerDrv() {
        try {
            baseUrl = PropertyLoader.loadProperty("site.url");
            gridHubUrl = PropertyLoader.loadProperty("grid.url");
            if ("".equals(gridHubUrl)) {
                gridHubUrl = null;
            }
            capabilities = PropertyLoader.loadCapabilities();
            driver = WebDriverPool.DEFAULT.getDriver(capabilities);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        iniAllHelpers();
    }

    @Override
    public AppHelper getAppHelper() {
        return appHelper;
    }
    
    @Override
    public PageManager getPages() {
        return pages;
    }
    
    private void iniAllHelpers() {
        pages = new PageManager(driver);
        appHelper = new AppHelperDrv(this);
    }
    
    public WebDriver getWebDriver() {
        return driver;
    }
    
    public void snsfn(){
        
    }

//    public RemoteWebDriver getWebDriver() {
//        return driver;
//    }
//
//    public String getBaseUrl() {
//        return baseUrl;
//    }
}
