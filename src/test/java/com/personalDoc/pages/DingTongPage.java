package com.personalDoc.pages;

import com.personalDoc.pageuis.DingTongPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 16/12/26.
 */
public class DingTongPage extends BasePage {

    public DingTongPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void dingtong() throws Exception {
        //切换到"选择你感兴趣的内容"页面
        //关闭顶通页
        driver.onclickBean(DingTongPageUI.CLOSE_BTN);
        driver.sleep(500);
    }

}



