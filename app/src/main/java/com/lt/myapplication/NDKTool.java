package com.lt.myapplication;

/**
 * @author liutao15
 * @version 4.2.0
 * @since 2020/8/7
 */
public class NDKTool {
    static {
        System.loadLibrary("NDKTool");
    }
    public native String getStringFromNDK();
}
