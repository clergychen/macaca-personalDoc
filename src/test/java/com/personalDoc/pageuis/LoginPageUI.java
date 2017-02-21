package com.personalDoc.pageuis;

import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import macaca.client.common.GetElementWay;

public class LoginPageUI extends BasePageUI{

//	public static final CommonUIBean LOGIN_BTN = new CommonUIBean(GetElementWay.ID, "com.github.android_app_bootstrap:id/login_button",GetElementWay.NAME,"Login", "登录按钮");
    public static final CommonUIBean USER_NAME = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"请输入手机号", "登录用户名输入框");
    public static final CommonUIBean VERIFY_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"发送验证码", "发送验证码按钮");
    public static final CommonUIBean PASSWORD = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"请输入验证码","登录验证码输入框");
    public static final CommonUIBean LOGIN_BTN = new CommonUIBean(GetElementWay.ID, "android_value",GetElementWay.NAME,"登 录", "登录按钮");
    public static final CommonUIBean SERVICE_AGREEMENT = new CommonUIBean(GetElementWay.ID,"android_value",GetElementWay.NAME,"软件许可及服务协议","软件许可及服务协议");
    public static final CommonUIBean LOGIN_OTHER = new CommonUIBean(GetElementWay.ID,"android_value",GetElementWay.NAME,"一账通","其他账号登录");

}
