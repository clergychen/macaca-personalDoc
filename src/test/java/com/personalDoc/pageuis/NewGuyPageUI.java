package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 16/12/26.
 */
public class NewGuyPageUI extends BasePageUI {

    public static final CommonUIBean NICK_NAME = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"请填写您的昵称",
            "新用户信息收集");
    public static final CommonUIBean WOMAN_BTN = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/tv_female",
            GetElementWay.NAME,"id_btnFemale",
            "女士");
    public static final CommonUIBean MAN_BTN = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/tv_male",
            GetElementWay.NAME,"id_btnMale",
            "男士");
    public static final CommonUIBean WELCOME = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/iv_info_image",
            GetElementWay.NAME,"id_gather_userinfo_welcome",
            "欢迎来到平安好医生");
    public static final CommonUIBean SEX_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"两性",
            "两性");
    public static final CommonUIBean DONE_BTN = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/btn_finish_step",
            GetElementWay.NAME,"id_btnFinish",
            "完成");

}
