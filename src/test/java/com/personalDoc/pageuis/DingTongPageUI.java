package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/26.
 */
public class DingTongPageUI extends BasePageUI {
    public static final CommonUIBean CLOSE_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]",
            "右上角叉叉");

    public static final CommonUIBean DINGTONG_PAGE = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "平安好医生",
            "马上查看");
}
