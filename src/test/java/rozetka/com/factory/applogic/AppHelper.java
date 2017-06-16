package rozetka.com.factory.applogic;

/**
 * Created by Frost on 14.06.2017.
 */
public interface AppHelper {

    void openMainPage();

    void clickSmartphoneAndElectronicCategory();

    void clickCategoryFilterByIndex(int index);

    boolean isSmartphoneCategoryApplied();
    
    void getTopItemData();
    
    boolean isNotOverThreeTopItemOnPage();

    void clickNextPage();

    void refreshPage();
    
}
