package com.personalDoc.pages;

import com.alibaba.fastjson.JSONObject;
import com.personalDoc.pageuis.PayPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 17/2/20.
 */
public class PayPage extends BasePage {

    public PayPage(String pageDesc){
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void pay() throws Exception {

        //往下滑动
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = (int) windowWidth / 2;
        driver.drag(centerX, (int) windowHeight - 100, centerX, 100, 0.3, 100);


        driver.onclickBean(PayPageUI.SIMULATE_PAY);
        driver.onclickBean(PayPageUI.CONFIRM_PAY);
        driver.sleep(500);
        driver.onclickBean(PayPageUI.PAY);
        driver.sleep(1500);
    }

}
