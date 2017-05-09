package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/27.
 */
public class AlertPageUI extends BasePageUI {
    //alert框内容
    public static final CommonUIBean ALERT_TEXT = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "允许访问后计步将更准确，走路赚钱每天6元，建议您设置为允许访问哦！",
            "alert框内容");

    public static final CommonUIBean OK_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[4]",
            "同意发送消息确认框");

    public static final CommonUIBean NOT_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[2]",
            "发送消息否决框");
    //定位同意框
    public static final CommonUIBean ALLOW_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]",
            "同意定位确认框");

    public static final CommonUIBean DONTALLOW_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]",
            "不同意定位框");
}
