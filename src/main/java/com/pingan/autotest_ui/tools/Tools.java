package com.pingan.autotest_ui.tools;

import com.oracle.tools.packager.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wuchao on 16/8/3.
 */
public class Tools {
    /**
     * 调用并执行cmd命令，运行后关闭cmd窗口
     * @param cmd
     */
    public static String runCMD(String cmd) {
        String cmdOut = null;
        BufferedReader br = null;
        try {
            String[] commod = {"sh", "-c", cmd};
            Process process = Runtime.getRuntime().exec(commod);
            br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null;
            while ((line = br.readLine()) != null) {
                cmdOut = line;
                Log.info(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cmdOut;
    }
}
