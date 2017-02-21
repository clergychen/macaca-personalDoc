package com.personalDoc.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class HomeListPageUI extends BasePageUI{

	public static final CommonUIBean LIST_VIEW = new CommonUIBean(
            GetElementWay.ID, "com.github.android_app_bootstrap:id/listview",
            GetElementWay.CLASS_NAME,"Table",
            "list view");

	//H5的TOP Bar
    public static final CommonUIBean TOP_BAR = new CommonUIBean(
            GetElementWay.CLASS_NAME, "android.widget.TextView",
            GetElementWay.NAME,"横幅",
            "TOP BAR横幅");

    //搜索框
    public static final CommonUIBean SEARCH = new CommonUIBean(
            GetElementWay.CLASS_NAME, "android.widget.TextView",
//            GetElementWay.NAME,"桃花姬128热卖",
            GetElementWay.XPATH, "\n" +
            "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]",
            "搜索框");

    //我的
    public static final CommonUIBean  MY_ORDER = new CommonUIBean(
            GetElementWay.CLASS_NAME, "android.widget.TextView",
            GetElementWay.NAME,"我的",
            "我的");

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
    //横幅
    public static final CommonUIBean  HENGFU = new CommonUIBean(
            GetElementWay.CLASS_NAME, "android.widget.TextView",
            GetElementWay.NAME,"桃花姬128热卖",
            "横幅");



}
