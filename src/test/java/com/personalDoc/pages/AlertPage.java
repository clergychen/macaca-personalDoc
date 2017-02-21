package com.personalDoc.pages;

import com.personalDoc.pageuis.AlertPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 16/12/27.
 */
public class AlertPage extends BasePage {

    public AlertPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void alert() throws Exception {
        driver.sleep(1500);
        driver.onclickBean(AlertPageUI.OK_BTN);
        driver.sleep(1500);
        driver.onclickBean(AlertPageUI.ALLOW_BTN);
    }

}
