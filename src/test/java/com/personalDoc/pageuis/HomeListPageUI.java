package com.personalDoc.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class HomeListPageUI extends BasePageUI{

	//H5的TOP Bar
    public static final CommonUIBean TOP_BAR = new CommonUIBean(
            GetElementWay.CLASS_NAME, "android.widget.TextView",
            GetElementWay.NAME,"横幅",
            "TOP BAR横幅");

    //搜索框
    public static final CommonUIBean SEARCH = new CommonUIBean(
            GetElementWay.XPATH, "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]",
            GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeWebView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]",
//            GetElementWay.NAME,"桃花姬128热卖",
            "搜索框");

    //我的订单
    public static final CommonUIBean  MY_ORDER = new CommonUIBean(
//            GetElementWay.XPATH,"//*[@resource-id=\"com.pingan.papd:id/root\"]/android.view.View[1]/android.view.View[3]",
            GetElementWay.NAME,"我的订单",
            GetElementWay.NAME,"我的订单",
            "我的订单");

    //剁手价-更多
    public static final CommonUIBean  MORE = new CommonUIBean(
            GetElementWay.CLASS_NAME, "android.widget.TextView",
            GetElementWay.CLASS_NAME,"更多",
            "剁手价更多");

    //购物车图标
    public static final CommonUIBean  CART = new CommonUIBean(
            GetElementWay.CLASS_NAME, "android.widget.TextView",
            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[28]",
            "购物车图标");
}
