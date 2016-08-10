package com.pingan.autotest_ui.business_logic.prepose;

import com.pingan.autotest_ui.base.AppOperate;
import com.pingan.autotest_ui.base.AutoTestBase;
import com.pingan.autotest_ui.object_page.Element_Common;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by wuchao on 16/8/8.
 */
public class Login extends AutoTestBase{
    public AppOperate operateBase;
    public WebDriverWait wait;
    public Element_Common element_common;

    public Login(){
        element_common = new Element_Common(driver);
    }

    public void slideLoginPage(){
        operateBase.acceptAlert();
        operateBase.swipeToRight(1000);
       // wait = new WebDriverWait(driver,10).until();
    }
}
