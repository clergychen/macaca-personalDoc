package com.personalDoc.pages;

import com.personalDoc.pageuis.NewGuyPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 16/12/28.
 */
public class NewGuy1Page extends BasePage {

    public NewGuy1Page(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void newguy1 () throws Exception {
        //切换到"选择你感兴趣的内容"页面
        driver.waitForElement(NewGuyPageUI.SEX_BTN);
        driver.onclickBean(NewGuyPageUI.SEX_BTN);
        driver.onclickBean(NewGuyPageUI.DONE_BTN);
        driver.sleep(2000);
    }
}
