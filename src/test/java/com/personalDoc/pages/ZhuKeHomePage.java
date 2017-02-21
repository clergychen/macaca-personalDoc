package com.personalDoc.pages;

import com.personalDoc.pageuis.ZhuKeHomePageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 16/12/26.
 */
public class ZhuKeHomePage extends BasePage {

    public ZhuKeHomePage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    /**
     * 点击home tab
     */
    public void tabHome() {driver.onclickBean(ZhuKeHomePageUI.HOME_TAB);}
    /**
     * 点击问诊 tab
     */
    public void tabAsk(){driver.onclickBean(ZhuKeHomePageUI.ASK_TAB);}

    /**
     * 点击商城 tab
     */
    public void tabMall(){driver.onclickBean(ZhuKeHomePageUI.MALL_TAB);}
    /**
     * 点击消息 tab
     */
    public void tabMessage() {driver.onclickBean(ZhuKeHomePageUI.MSG_TAB);}

    /**
     * 点击健康头条 tab
     */
    public void goToList(){driver.onclickBean(ZhuKeHomePageUI.TOP10_TAB);}
}
