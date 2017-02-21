package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/28.
 */
public class NewGuy1PageUI extends BasePageUI {
    public static final CommonUIBean NEXT_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"下一步", "下一步");
    public static final CommonUIBean SEX_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"两性", "两性");
    public static final CommonUIBean DONE_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"完成", "完成");
}
