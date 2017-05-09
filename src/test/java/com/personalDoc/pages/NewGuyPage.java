package com.personalDoc.pages;

import com.personalDoc.pageuis.NewGuyPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 16/12/26.
 */
public class NewGuyPage extends BasePage {

    public NewGuyPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void newguy (String nickname) throws Exception {
        //选择性别
        driver.onclickBean(NewGuyPageUI.WOMAN_BTN);
        driver.onclickBean(NewGuyPageUI.DONE_BTN);
        //
//        driver.inputBean(NewGuyPageUI.NICK_NAME, nickname);
//        driver.sleep(500);
    }
}
