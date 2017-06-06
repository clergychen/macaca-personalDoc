package com.personalDoc.pages;

import com.alibaba.fastjson.JSONObject;
import macaca.java.biz.BasePage;
import com.personalDoc.pageuis.HomeListPageUI;

public class HomeListPage extends BasePage{

	public HomeListPage(String pageDesc) {
		super(pageDesc);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 上下滑动
	 * @throws Exception
	 */
	public void scroll() throws Exception {

		JSONObject windowSize = driver.getWindowSize();
		int windowWidth = windowSize.getIntValue("width");
		int windowHeight = windowSize.getIntValue("height");

		int centerX = windowWidth / 2;
		driver.drag(centerX, windowHeight - 300, centerX, 100, 1);
		driver.sleep(1000);
		driver.drag(centerX, 300, centerX, windowHeight - 100, 1);
		driver.sleep(1000);
	}

//	/**
//	 * 点击指定的cell
//	 * @param index 要点击的cell的index,限可视区域
//	 */
//	public void onclickOneCell(int index) throws Exception{
//		driver.onclickBeanAtIndex(HomeListPageUI.TOP_BAR, index);
//	}

	/**
	 * 点击搜索框
	 *
	 */
	public void onclickSearch () throws Exception {
//		Element element = driver.elementByXPath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[28]");

		//点击搜索框
		driver.onclickBean(HomeListPageUI.SEARCH);

//		Element element = driver.waitForElement(HomeListPageUI.CART);
//		element.click();
//		driver.sleep(1000);
//		driver.onclickBean(HomeListPageUI.MY_ORDER);
//		driver.sleep(1000);
	}

}
