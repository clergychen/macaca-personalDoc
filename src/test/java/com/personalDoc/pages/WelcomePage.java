package com.personalDoc.pages;

import com.alibaba.fastjson.JSONObject;
import com.personalDoc.pageuis.WelcomePageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 16/12/26.
 */
public class WelcomePage extends BasePage {

    public WelcomePage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    /**
     * 左右滑动
     * @throws Exception
     */
    public void scroll() throws Exception {

        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");

        int centerY = windowHeight / 2;
        driver.sleep(1500);
        driver.drag(windowWidth -10, centerY, 50, centerY, 0.5, 20);
        driver.sleep(1500);
        driver.drag(windowWidth -10, centerY, 50, centerY, 0.5, 20);
        driver.sleep(1500);
//        driver.onclickBean(WelcomePageUI.IN_BTN);
        driver.onclickBean(WelcomePageUI.SKIP_BTN);
        driver.sleep(1000);
    }

}
