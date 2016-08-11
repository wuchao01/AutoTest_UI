package com.pingan.autotest_ui.testsuits.login;

import com.pingan.autotest_ui.base.AutoTestBase;
import com.pingan.autotest_ui.business_logic.prepose.Login;

/**
 * Created by wuchao on 16/8/10.
 */
public class Personal_Tests extends AutoTestBase{

    public void mobileOtpLogin() throws Throwable{
        Login.slideLoginPage();
    }
}
