package com.pingan.autotest_ui.business_logic.prepose;

import com.oracle.tools.packager.Log;
import com.pingan.autotest_ui.base.AppOperate;
import com.pingan.autotest_ui.base.AutoTestBase;
import com.pingan.autotest_ui.object_page.Element_Common;

import java.util.InputMismatchException;

/**
 * Created by wuchao on 16/8/8.
 */
public class Login extends AutoTestBase{
    public static AppOperate operateBase;
    public static Element_Common element_common;

    public Login(){
        element_common = new Element_Common(driver);
    }

    public static void slideLoginPage() throws InputMismatchException{
        operateBase.acceptAlert();
        operateBase.swipeToRight(1000);
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Log.info("点击引导页－立即启动");
        element_common.AppGuide_ImmediatelStart.click();
    }
}
