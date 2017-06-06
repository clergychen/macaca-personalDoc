package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/13.
 */
public class ProductDetailPageUI extends BasePageUI {

    //店铺页
    public static final CommonUIBean SHOP_PAGE = new CommonUIBean(
            GetElementWay.NAME, "好药师官方旗舰店",
            GetElementWay.NAME,"好药师官方旗舰店",
            "好药师店铺页");

    //tab详情
    public static final CommonUIBean TOP_BAR = new CommonUIBean(
            GetElementWay.NAME, "商品详情",
            GetElementWay.NAME,"商品详情",
            "商品详情");

    //tab商品
    public static final CommonUIBean TAB_PRODUCT = new CommonUIBean(
            GetElementWay.NAME, "商品",
            GetElementWay.NAME,"商品",
            "商品");
    //tab详情
    public static final CommonUIBean TAB_DETAIL = new CommonUIBean(
            GetElementWay.ID, "//*[@resource-id=\"com.pingan.papd:id/ll_content_new\"]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]",
            GetElementWay.NAME,"详情",
            "详情");
    //商品主图
    public static final CommonUIBean PRODUCT_MAIN_PIC = new CommonUIBean(
            GetElementWay.XPATH, "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[3]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.view.View[1]/android.widget.Image[1]",
            GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeImage[1]",
            "商品主图");
    //商品名称
    public static final CommonUIBean TITLE = new CommonUIBean(
            GetElementWay.NAME, "冈本避孕套(纯)",
            GetElementWay.NAME,"冈本避孕套(纯)",
            "商品名称");
    //返回
    public static final CommonUIBean BACK = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/native_title_bar_iv_left",
            GetElementWay.NAME,"id_system_icon_back",
            "返回");
    //购物车
    public static final CommonUIBean CART = new CommonUIBean(
            GetElementWay.NAME, "购物车",
            GetElementWay.NAME,"购物车",
            "购物车");
    //立即购买
    public static final CommonUIBean BUY = new CommonUIBean(
            GetElementWay.NAME, "立即购买",
            GetElementWay.NAME,"立即购买",
            "立即购买");
    //加入购物车
    public static final CommonUIBean ADD_TO_CART = new CommonUIBean(
            GetElementWay.NAME, "加入购物车",
            GetElementWay.NAME,"加入购物车",
            "加入购物车");
    //在线咨询
    public static final CommonUIBean ONLINE_CONSULT = new CommonUIBean(
            GetElementWay.NAME, "在线咨询",
            GetElementWay.NAME,"在线咨询",
            "在线咨询");
}
