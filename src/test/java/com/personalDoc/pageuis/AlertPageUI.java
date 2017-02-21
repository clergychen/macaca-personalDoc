package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/27.
 */
public class AlertPageUI extends BasePageUI {

    public static final CommonUIBean OK_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[4]",
            "同意发送消息确认框");

    public static final CommonUIBean NOT_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[2]",
            "发送消息否决框");

    public static final CommonUIBean ALLOW_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[4]",
            "同意定位确认框");

    public static final CommonUIBean DONTALLOW_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeAlert[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeCollectionView[1]/XCUIElementTypeOther[2]",
            "不同意定位框");
}
