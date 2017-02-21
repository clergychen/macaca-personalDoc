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
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"请添加收货地址",
            "请添加收货地址");

    //TOP bar 订单填写
    public static final CommonUIBean TITLE = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"订单填写",
            "订单填写");

    //提交订单
    public static final CommonUIBean SUBMIT_ORDER = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"提交订单",
            "提交订单");


}
