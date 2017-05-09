package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/26.
 */
public class DingTongPageUI extends BasePageUI {
    public static final CommonUIBean CLOSE_BTN = new CommonUIBean(
            GetElementWay.XPATH, "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Button[1]",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]",
            "右上角叉叉");

    public static final CommonUIBean DINGTONG_PAGE = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/ll_content",
            GetElementWay.NAME, "平安好医生",
            "马上查看");

    public static final CommonUIBean DINGTONG_BACK = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/native_title_bar_iv_left",
            GetElementWay.NAME, "",
            "返回按钮");
}
