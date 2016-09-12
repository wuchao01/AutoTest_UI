package com.pingan.autotest_ui.util;

import com.oracle.tools.packager.Log;
import com.pingan.autotest_ui.tools.Tools;

/**
 * Created by wuchao on 16/8/3.
 */
public class StartAppiumServer {
    private  String udid;
    private  int port;
    private String appiumPath;
    public StartAppiumServer(String udid,int port){
        this.udid = udid;
        this.port = port;
        appiumPath = "/Users/wuchao/Documents/AutoTools/Appium.app/Contents/Resources/node_modules/appium/bin/";
    }

    /**
     * 启动appium服务
     */
    public void run(){
        String commod = "node" + appiumPath + "appium.js -a 127.0.0.1 -p" + port + "-U" + udid + " --session-override";
        Log.info("run " + udid + " appiumServer:" + port + ".....");
        Log.info("start appium ->>>" + commod);
        Tools.runCMD(commod);
    }
}
