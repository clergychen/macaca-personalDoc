package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/26.
 */
public class NewGuyPageUI extends BasePageUI {

    public static final CommonUIBean NICK_NAME = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"请填写您的昵称", "新用户信息收集");
    public static final CommonUIBean WOMAN_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"女士", "女士");
    public static final CommonUIBean MAN_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"男士", "男士");
    public static final CommonUIBean NEXT_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"下一步", "下一步");
    public static final CommonUIBean SEX_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"两性", "两性");
    public static final CommonUIBean DONE_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"完成", "完成");

}
