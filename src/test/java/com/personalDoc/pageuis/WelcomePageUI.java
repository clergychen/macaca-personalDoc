package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/26.
 */
public class WelcomePageUI extends BasePageUI {
    public static final CommonUIBean WEL_VIEW = new CommonUIBean(GetElementWay.ID, "android_value", GetElementWay.CLASS_NAME, "Application", "欢迎页");
    public static final CommonUIBean IN_BTN = new CommonUIBean(GetElementWay.ID, "android_value", GetElementWay.NAME, "id_skipButton", "立即体验");
    public static final CommonUIBean SKIP_BTN = new CommonUIBean(GetElementWay.ID, "android_value", GetElementWay.NAME, "id_exitButton", "跳过");
}
