package com.personalDoc.pages;

import macaca.java.biz.BasePage;
import com.personalDoc.pageuis.LoginPageUI;

public class LoginPage extends BasePage {

	public LoginPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	// 登录操作
	public void login(String username ,String password) throws Exception {
		driver.waitForElement(LoginPageUI.USER_NAME);
		driver.inputBean(LoginPageUI.USER_NAME, username);
        driver.waitForElement(LoginPageUI.PASSWORD);
        driver.inputBean(LoginPageUI.PASSWORD, password);

        //点击发送验证码
		driver.waitForElement(LoginPageUI.VERIFY_BTN);
        driver.onclickBean(LoginPageUI.VERIFY_BTN);
        driver.sleep(1500);
		driver.waitForElement(LoginPageUI.LOGIN_BTN);
		driver.onclickBean(LoginPageUI.LOGIN_BTN);
	}
}
