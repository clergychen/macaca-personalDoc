package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePage;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/26.
 */
public class ZhuKeHomePageUI extends BasePageUI {
    //顶bar的我的
    public static final CommonUIBean ME = new CommonUIBean(
            GetElementWay.NAME, "我的",
            GetElementWay.NAME, "我的",
            "我的");

    public static final CommonUIBean MALL_TAB = new CommonUIBean(
            GetElementWay.NAME, "健康商城",
            GetElementWay.NAME, "健康商城",
            "健康商城");

    public static final CommonUIBean HOME_TAB = new CommonUIBean(
            GetElementWay.NAME, "首页",
            GetElementWay.NAME, "首页",
            "首页");

    public static final CommonUIBean ASK_TAB = new CommonUIBean(
            GetElementWay.NAME, "问医生",
            GetElementWay.NAME, "问医生",
            "问医生");

    public static final CommonUIBean MSG_TAB = new CommonUIBean(
            GetElementWay.NAME, "消息",
            GetElementWay.NAME, "消息",
            "消息");

    public static final CommonUIBean TOP10_TAB = new CommonUIBean(
            GetElementWay.NAME, "健康头条",
            GetElementWay.NAME, "健康头条",
            "健康头条");
}
