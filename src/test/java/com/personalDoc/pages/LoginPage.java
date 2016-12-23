package com.personalDoc.pages;

import macaca.java.biz.BasePage;
import com.personalDoc.pageuis.LoginPageUI;

public class LoginPage extends BasePage {

	public LoginPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	// 登录操作
	public void login(String username ,String password){
		driver.inputBean(LoginPageUI.USER_NAME, username);
		driver.inputBean(LoginPageUI.PASSWORD, password);
		driver.onclickBean(LoginPageUI.LOGIN_BTN);
	}
}
