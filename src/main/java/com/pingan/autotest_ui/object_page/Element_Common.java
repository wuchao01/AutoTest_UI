package com.pingan.autotest_ui.object_page;

import com.pingan.autotest_ui.base.ObjctPageBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wuchao on 16/8/10.
 */
public class Element_Common extends ObjctPageBase{
    public Element_Common(WebDriver driver){
        super(driver);
    }
    /**
     * 引导页－立即启动
     */
    @AndroidFindBy(xpath = "")
    @iOSFindBy(xpath = "//UIAButton[@name='skipbuttonbg']")
    public WebElement AppGuide_ImmediatelStart;
}
