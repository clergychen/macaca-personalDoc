package com.personalDoc.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class LoginPageUI extends BasePageUI{
    //请输入手机号
    public static final CommonUIBean USER_NAME = new CommonUIBean(
        GetElementWay.ID, "com.pingan.papd:id/phone_number_edit",
        GetElementWay.NAME,"请输入手机号",
        "登录用户名输入框");
    public static final CommonUIBean VERIFY_BTN = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/send_reqcode_btn",
            GetElementWay.NAME,"发送验证码",
            "发送验证码按钮");
    public static final CommonUIBean PASSWORD = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/verify_code_et",
            GetElementWay.NAME,"请输入验证码",
            "登录验证码输入框");
    public static final CommonUIBean LOGIN_BTN = new CommonUIBean(
            GetElementWay.ID, "com.pingan.papd:id/login_btn",
            GetElementWay.NAME,"登 录",
            "登录按钮");
    public static final CommonUIBean SERVICE_AGREEMENT = new CommonUIBean(
            GetElementWay.ID,"com.pingan.papd:id/tv_app_protocal",
            GetElementWay.NAME,"软件许可及服务协议",
            "软件许可及服务协议");
    public static final CommonUIBean LOGIN_OTHER = new CommonUIBean(
            GetElementWay.NAME,"一账通",
            GetElementWay.NAME,"一账通",
            "其他账号登录");

}
