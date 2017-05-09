package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/23.
 */
public class AnyDoorPageUI extends BasePageUI {

    //任意门温馨提示
    public static final CommonUIBean ANY_DOOR = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "任意门温馨提示",
            "任意门温馨提示");

    //烦死我了
    public static final CommonUIBean LEAVE_ME = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME, "烦死我了",
            "烦死我了");
}
