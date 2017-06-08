package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/20.
 */
public class PayPageUI extends BasePageUI {
    //TOP bar 订单填写
    public static final CommonUIBean TITLE = new CommonUIBean(
            GetElementWay.NAME, "健康支付",
            GetElementWay.NAME,"健康支付",
            "健康支付");
    //模拟支付
    public static final CommonUIBean SIMULATE_PAY = new CommonUIBean(
            GetElementWay.XPATH, "//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.widget.ListView[2]/android.view.View[9]/android.view.View[2]",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[4]/XCUIElementTypeOther[8]/XCUIElementTypeLink[1]",
            "模拟支付");
    //确认支付
    public static final CommonUIBean CONFIRM_PAY = new CommonUIBean(
            GetElementWay.NAME, "确认支付",
            GetElementWay.NAME, "确认支付",
            "确认支付");
    //立即支付
    public static final CommonUIBean PAY = new CommonUIBean(
            GetElementWay.NAME, "立即支付",
            GetElementWay.NAME, "立即支付",
            "立即支付");
}
