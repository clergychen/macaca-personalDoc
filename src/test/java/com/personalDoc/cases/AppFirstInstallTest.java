package com.personalDoc.cases;

import com.personalDoc.pages.*;
import com.personalDoc.pageuis.*;
import org.junit.Test;

import macaca.java.biz.ResultGenerator;

import java.util.Random;

public class AppFirstInstallTest extends BaseTest{

	@Test
	public void test () throws Exception {

		//数据准备
		//搞个随机数
		Random random = new Random(System.currentTimeMillis());
		int randInt = random.nextInt(900000) + 100000;
		//定义登陆唯一
		String receiverNo = String.valueOf(randInt);
		System.out.println("手机号码=13564" + receiverNo);
		String phoneNum = "13564" + receiverNo;

		// 欢迎页
		WelcomePage welcomePage = new WelcomePage("欢迎页");
		welcomePage.setDriver(driver);
		if (welcomePage.hasPageShown(WelcomePageUI.WEL_VIEW)) {
			saveScreen(welcomePage.pageDesc);
			ResultGenerator.loadPageSucc(welcomePage);

			// 滑动
			welcomePage.scroll();
			driver.sleep(2000);
		} else {
			ResultGenerator.loadPageFail(welcomePage);

		}

		// 处理登录
		LoginPage loginPage = new LoginPage("登录页");
		loginPage.setDriver(driver);
		if (loginPage.hasPageShown(LoginPageUI.VERIFY_BTN)) {
			saveScreen(loginPage.pageDesc);
			ResultGenerator.loadPageSucc(loginPage);

			//登陆参数
			loginPage.login(phoneNum, "666666");
		} else {
			ResultGenerator.loadPageFail(loginPage);

		}

		// 选择消息提醒页
		AlertPage alertPage = new AlertPage("选择消息提醒页");
		alertPage.setDriver(driver);
		if (alertPage.hasPageShown(AlertPageUI.OK_BTN)) {
			saveScreen(alertPage.pageDesc);
			ResultGenerator.loadPageSucc(alertPage);
			//执行
			alertPage.alert();
		} else {
			ResultGenerator.loadPageFail(alertPage);

		}

		// 信息收集(新用户)
		NewGuyPage newguyPage = new NewGuyPage("信息收集页");
		newguyPage.setDriver(driver);
		if (newguyPage.hasPageShown(NewGuyPageUI.NEXT_BTN)) {
			saveScreen(newguyPage.pageDesc);
			ResultGenerator.loadPageSucc(newguyPage);
			//创建用户
			String user = "uitest" + phoneNum;
			newguyPage.newguy(user);
		} else {
			ResultGenerator.loadPageFail(newguyPage);
		}

		// 选择感兴趣内容(新用户)
		NewGuy1Page newguy1Page = new NewGuy1Page("选择感兴趣内容页");
		newguy1Page.setDriver(driver);
		if (newguy1Page.hasPageShown(NewGuy1PageUI.SEX_BTN)) {
			saveScreen(newguy1Page.pageDesc);
			ResultGenerator.loadPageSucc(newguy1Page);
			//
			newguy1Page.newguy1();
		} else {
			ResultGenerator.loadPageFail(newguy1Page);
		}

		// 顶通页(新用户)
		DingTongPage dingtongPage = new DingTongPage("顶通页");
		dingtongPage.setDriver(driver);
		if (dingtongPage.hasPageShown(DingTongPageUI.DINGTONG_PAGE)) {
			saveScreen(dingtongPage.pageDesc);
			ResultGenerator.loadPageSucc(dingtongPage);
			//
			dingtongPage.dingtong();
		} else {
			ResultGenerator.loadPageFail(dingtongPage);
		}

		// 主客首页
		ZhuKeHomePage zhukehomePage = new ZhuKeHomePage("主客首页");
		zhukehomePage.setDriver(driver);
		if (zhukehomePage.hasPageShown(ZhuKeHomePageUI.MALL_TAB)) {
			saveScreen(zhukehomePage.pageDesc);
			ResultGenerator.loadPageSucc(zhukehomePage);
			// 进入商城首页
			zhukehomePage.tabMall();
			saveScreen("进入商城首页");
		} else {
			// 首页没有加载成功，后面的用例都不用执行了，return
			ResultGenerator.loadPageFail(zhukehomePage);
			return;
		}

		// 商城首页List页
		HomeListPage homeListPage = new HomeListPage("首页列表页");
		homeListPage.setDriver(driver);
		if (homeListPage.hasPageShown(HomeListPageUI.MY_ORDER)) {
//            driver.waitForElement(HomeListPageUI.CART);
//            driver.waitForElement(HomeListPageUI.SEARCH);
//            driver.waitForElement(HomeListPageUI.TOP_BAR);
//            driver.waitForElement(HomeListPageUI.MORE);
			saveScreen(homeListPage.pageDesc);
			ResultGenerator.loadPageSucc(homeListPage);
			// 滑动
			homeListPage.scroll();
			driver.sleep(1000);
			//点击搜索框
			homeListPage.onclickSearch();
			driver.sleep(1000);
		} else {
			// 商城首页没有加载成功
			ResultGenerator.loadPageFail(homeListPage);
			return;
		}
	}
}
