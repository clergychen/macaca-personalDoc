package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/9.
 */
public class SearchPageUI extends BasePageUI {
    //第一次进入搜索框
    public static final CommonUIBean FIRST_SEARCH_BAR = new CommonUIBean(
            GetElementWay.XPATH,"//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]",
            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField[1]",
            "第一次进入搜索框");

    //有历史结果页的搜索框
    public static final CommonUIBean SEARCH_BAR = new CommonUIBean(
            GetElementWay.XPATH,"//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.EditText[1]",
            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSearchField[1]",
            "有历史结果页的搜索框");
    //热门搜索
    public static final CommonUIBean HOT_SEARCH = new CommonUIBean(
//            GetElementWay.XPATH,"//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]",
            GetElementWay.NAME,"热门搜索",
            GetElementWay.NAME,"热门搜索",
            "热门搜索");

    //点击list中的备选item
    public static final CommonUIBean SOURCE_ITEM = new CommonUIBean(
            GetElementWay.NAME, "冈本避孕套(纯)",
            GetElementWay.NAME,"冈本避孕套(纯)",
            "冈本避孕套(纯)");

    //键盘搜索按钮
    public static final CommonUIBean SEARCH = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"Search",
            "键盘搜索按钮");
}
