package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/9.
 */
public class SearchPageUI extends BasePageUI {

    public static final CommonUIBean SEARCH_BAR = new CommonUIBean(
            GetElementWay.ID, "android_value",
//            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTextField[1]",
            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]",
            "list view");
    //热门搜索
    public static final CommonUIBean HOT_SEARCH = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"热门搜索",
            "list view");

    //平安质保 正品低价 假一赔十
    public static final CommonUIBean LOW_PRICE = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"平安质保 正品低价 假一赔十",
            "list view");

    //点击list中的备选item
    public static final CommonUIBean GANG_BEN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"冈本避孕套(纯)",
            "冈本避孕套(纯)");

    //点击搜索结果
    public static final CommonUIBean ITEM_1 = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]",
            "冈本避孕套(纯)");

}
