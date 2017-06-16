package rozetka.com.factory.applogicDrv;

import rozetka.com.factory.applogic.AppHelper;
import rozetka.com.pages.PageManager;

/**
 * Created by Frost on 14.06.2017.
 */
public class AppHelperDrv implements AppHelper {

    protected PageManager pages;
    
    public AppHelperDrv(ApplicationManager app) {
        pages = app.getPages();
    }
    
    public void openMainPage() {
        pages.homePage.openMainPage();
    }
    
    public void clickSmartphoneAndElectronicCategory() {
        pages.homePage.clickSmartphoneAndElectronicCategory();
    }

    public void clickCategoryFilterByIndex(int index) {
        pages.homePage.clickCategoryFilterByIndex(index);
    }

    public boolean isSmartphoneCategoryApplied() {
        return pages.homePage.isSmartphoneCategoryApplied();
    }
    
    public void getTopItemData() {
        pages.homePage.getTopItemData();
    }
    
    public boolean isNotOverThreeTopItemOnPage() {
        return pages.homePage.isNotOverThreeTopItemOnPage();
    }

    public void clickNextPage() {
        pages.homePage.clickNextPage();
    }

    public void refreshPage() {

    }
}
