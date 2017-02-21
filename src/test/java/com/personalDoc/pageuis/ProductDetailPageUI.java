package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/13.
 */
public class ProductDetailPageUI extends BasePageUI {

    //tab商品
    public static final CommonUIBean TAB_PRODUCT = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"商品",
            "商品");
    //tab详情
    public static final CommonUIBean TAB_DETAIL = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"详情",
            "详情");
    //商品主图
    public static final CommonUIBean PRODUCT_MAIN_PIC = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]",
            "商品主图");
    //商品名称
    public static final CommonUIBean TITLE = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"冈本避孕套(纯)",
            "商品名称");
    //返回
    public static final CommonUIBean BACK = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"id_system_icon_back",
            "返回");
    //购物车
    public static final CommonUIBean CART = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"购物车",
            "购物车");
    //立即购买
    public static final CommonUIBean BUY = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"加入购物车",
            "加入购物车");
    //返回
    public static final CommonUIBean d = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"id_system_icon_back",
            "返回");
}
