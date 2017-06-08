package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/16.
 */
public class OrderFillPageUI extends BasePageUI {

    //请添加收货地址
    public static final CommonUIBean ADD_ADDRESS = new CommonUIBean(
//            GetElementWay.XPATH, "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[1]",
            GetElementWay.NAME,"请添加收货地址",
            GetElementWay.NAME,"请添加收货地址",
            "请添加收货地址");

    //TOP bar 订单填写
    public static final CommonUIBean TITLE = new CommonUIBean(
            GetElementWay.NAME, "订单填写",
            GetElementWay.NAME,"订单填写",
            "订单填写");

    //提交订单
    public static final CommonUIBean SUBMIT_ORDER = new CommonUIBean(
            GetElementWay.NAME, "提交订单",
            GetElementWay.NAME,"提交订单",
            "提交订单");


}
