package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/17.
 */
public class AddNewAddressPageUI extends BasePageUI{

    public static final CommonUIBean CONSIGNEE = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "收货人",
            "收货人");

    public static final CommonUIBean CELL_NUM = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "手机号码",
            "手机号码");
    public static final CommonUIBean LOCATION = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "所在地区",
            "所在地区");
    public static final CommonUIBean REC_ADDRESS = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "收货地址",
            "收货地址");

    public static final CommonUIBean SAVE = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "保存",
            "保存");

    public static final CommonUIBean SH = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "上海市",
            "上海市");

    public static final CommonUIBean HUANG_PU = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "黄浦区",
            "黄浦区");
}
