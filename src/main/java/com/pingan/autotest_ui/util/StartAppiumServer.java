package com.pingan.autotest_ui.util;

import com.pingan.autotest_ui.tools.Tools;

/**
 * Created by wuchao on 16/8/3.
 */
public class StartAppiumServer {
    private  String udid;
    private  int port;
    public StartAppiumServer(String udid,int port){
        this.udid = udid;
        this.port = port;
    }

    public void run(){
        String commod = "";
        Tools.runCMD(commod);
    }
}
