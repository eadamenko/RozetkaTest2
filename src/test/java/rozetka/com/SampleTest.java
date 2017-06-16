package rozetka.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import rozetka.com.pages.HomePage;

public class SampleTest extends TestBase {

  private HomePage homepage;

  @Test
  public void TestRozetka() {
    app.getAppHelper().openMainPage();
    app.getAppHelper().clickSmartphoneAndElectronicCategory();
    app.getAppHelper().clickCategoryFilterByIndex(1); //phone categoty
    app.getAppHelper().clickCategoryFilterByIndex(1); //smartphone category
    Assert.assertTrue(app.getAppHelper().isSmartphoneCategoryApplied(), "Smartphone category applied");

    for (int i = 0; i < 3; i++) {
      app.getAppHelper().getTopItemData();
      app.getAppHelper().clickNextPage();
    }
    Assert.assertTrue(app.getAppHelper().isNotOverThreeTopItemOnPage(), "Not over three TopItems on page");
  }

}
