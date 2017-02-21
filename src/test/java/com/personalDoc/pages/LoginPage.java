package com.personalDoc.pages;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePage;
import com.personalDoc.pageuis.LoginPageUI;

public class LoginPage extends BasePage {

	public LoginPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	// 登录操作
	public void login(String username ,String password) throws Exception {
		driver.inputBean(LoginPageUI.USER_NAME, username);
        driver.sleep(500);
        driver.inputBean(LoginPageUI.PASSWORD, password);
        driver.sleep(500);
        //点击发送验证码
        driver.onclickBean(LoginPageUI.VERIFY_BTN);
        driver.sleep(500);
		driver.onclickBean(LoginPageUI.LOGIN_BTN);
	}
}
