package com.personalDoc.pages;

import com.personalDoc.pageuis.AnyDoorPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 17/2/23.
 */
public class AnyDoorPage extends BasePage {

    public AnyDoorPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }
    public void leaveMe() throws Exception {
        driver.onclickBean(AnyDoorPageUI.LEAVE_ME);
    }
}
