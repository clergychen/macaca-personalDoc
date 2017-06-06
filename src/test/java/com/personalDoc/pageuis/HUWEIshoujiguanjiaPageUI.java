package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 2017/6/2.
 */
public class HUWEIshoujiguanjiaPageUI extends BasePageUI{
    //读取位置信息
    public static final CommonUIBean LOCA_INFO = new CommonUIBean(
            GetElementWay.NAME, "读取位置信息",
            GetElementWay.NAME, "读取位置信息",
            "HUAWEI手机管家的-读取位置信息");

    //读取本机识别码
    public static final CommonUIBean ID_CODE = new CommonUIBean(
            GetElementWay.NAME, "读取本机识别码",
            GetElementWay.NAME, "读取本机识别码",
            "HUAWEI手机管家的-读取本机识别码");



    //允许
    public static final CommonUIBean OK_BTN = new CommonUIBean(
            GetElementWay.NAME, "允许",
            GetElementWay.NAME, "允许",
            "HUAWEI手机管家的-允许");


}
