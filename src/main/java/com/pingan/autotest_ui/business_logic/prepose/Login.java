package com.pingan.autotest_ui.business_logic.prepose;

import com.pingan.autotest_ui.base.AppOperate;
import com.pingan.autotest_ui.base.AutoTestBase;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by wuchao on 16/8/8.
 */
public class Login extends AutoTestBase{
    public AppOperate operateBase;
    public WebDriverWait wait;
    public void slideLoginPage(){
        operateBase.acceptAlert();
        operateBase.swipeToRight(1000);
       // wait = new WebDriverWait(driver,10).until();
    }
}
