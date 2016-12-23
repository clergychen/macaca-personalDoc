package com.personalDoc.cases;

import org.junit.Test;

import macaca.java.biz.ResultGenerator;
import com.personalDoc.pages.BaiDuPage;
import com.personalDoc.pages.HomeListPage;
import com.personalDoc.pages.HomePage;
import com.personalDoc.pages.LoginPage;
import com.personalDoc.pages.PersonalPage;
import com.personalDoc.pages.WebviewPage;
import com.personalDoc.pageuis.BaiDuPageUI;
import com.personalDoc.pageuis.HomeListPageUI;
import com.personalDoc.pageuis.HomePageUI;
import com.personalDoc.pageuis.LoginPageUI;
import com.personalDoc.pageuis.PersonalPageUI;
import com.personalDoc.pageuis.WebviewPageUI;

public class SampleTest extends BaseTest{

	@Test
	public void test () throws Exception {

		// 处理登录
		LoginPage loginPage = new LoginPage("登录页");
		loginPage.setDriver(driver);
		if (loginPage.hasPageShown(LoginPageUI.LOGIN_BTN)) {
			saveScreen(loginPage.pageDesc);
			ResultGenerator.loadPageSucc(loginPage);
			loginPage.login("test", "123");
		} else {
			ResultGenerator.loadPageFail(loginPage);

		}

		// 测试首页
		HomePage homePage = new HomePage("首页");
		homePage.setDriver(driver);
		if (homePage.hasPageShown(HomePageUI.HOME_TAB)) {
			saveScreen(homePage.pageDesc);
			ResultGenerator.loadPageSucc(homePage);
			// 进入list
			homePage.goToList();
		} else {
			// 首页没有加载成功，后面的用例都不用执行了，return
			ResultGenerator.loadPageFail(homePage);
			return;
		}

		// 首页List页
		HomeListPage homeListPage = new HomeListPage("首页列表页");
		homeListPage.setDriver(driver);
		if (homeListPage.hasPageShown(HomeListPageUI.LIST_VIEW)) {
			saveScreen(homeListPage.pageDesc);
			ResultGenerator.loadPageSucc(homeListPage);

			// 滑动
			homeListPage.scroll();

			// 点击第一个cell
//			homeListPage.onclickOneCell(0);
//			driver.sleep(2000);
//
//			// 回到list页
//			driver.customBack();
//			driver.sleep(2000);

			// 回到首页
			driver.customBack();
		}

		driver.sleep(1000);

		// 测试webView Tab
		homePage.tabWebView();
		WebviewPage webviewPage = new WebviewPage("webviewPage");
		webviewPage.setDriver(driver);
		if (webviewPage.hasPageShown(WebviewPageUI.WEB_VIEW_TITLE)) {
			saveScreen(webviewPage.pageDesc);
			ResultGenerator.loadPageSucc(webviewPage);

			// Push view
			webviewPage.pushView();
			driver.sleep(1000);
			driver.customBack();

			// 修改标题
			webviewPage.setTitle();
			saveScreen(webviewPage.pageDesc+"_newTitle");
		} else {
			ResultGenerator.loadPageFail(webviewPage);
		}

		driver.sleep(1000);

		// 测试浏览器
		homePage.tabBaiDu();
		BaiDuPage baiDuPage = new BaiDuPage("百度");
		baiDuPage.setDriver(driver);
		if (baiDuPage.hasPageShown(BaiDuPageUI.SEARCH_BTN)) {
			saveScreen(baiDuPage.pageDesc);
			ResultGenerator.loadPageSucc(baiDuPage);

			// 搜索
//			baiDuPage.search("Macaca");
//			driver.sleep(2000);


		} else {
			ResultGenerator.loadPageFail(baiDuPage);
		}

		driver.sleep(1000);
		// 测试Personal
		homePage.tabPersonal();
		PersonalPage personalPage = new PersonalPage("个人主页");
		personalPage.setDriver(driver);
		if (personalPage.hasPageShown(PersonalPageUI.LOG_OUT_BTN)) {
			saveScreen(personalPage.pageDesc);
			ResultGenerator.loadPageSucc(personalPage);

			// logout
			personalPage.logout();

		} else {
			ResultGenerator.loadPageFail(personalPage);
		}

	}
}
