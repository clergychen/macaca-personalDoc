package com.personalDoc.pages;

import com.personalDoc.pageuis.HUWEIshoujiguanjiaPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 2017/6/2.
 */
public class HUWEIshoujiguanjiaPage extends BasePage{

    public HUWEIshoujiguanjiaPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void shoujiguanjia() throws Exception {
        driver.onclickBean(HUWEIshoujiguanjiaPageUI.OK_BTN);



    }

}
