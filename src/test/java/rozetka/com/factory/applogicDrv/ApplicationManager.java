package rozetka.com.factory.applogicDrv;

import rozetka.com.factory.applogic.AppHelper;
import rozetka.com.pages.PageManager;

/**
 * Created by Frost on 14.06.2017.
 */
public interface ApplicationManager {

    AppHelper getAppHelper();
    
    PageManager getPages();

}
