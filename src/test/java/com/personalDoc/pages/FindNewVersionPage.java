package com.personalDoc.pages;

import com.personalDoc.pageuis.FindNewVersionPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 17/4/25.
 */
public class FindNewVersionPage extends BasePage {

    public FindNewVersionPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void updateLater() throws Exception {
        driver.onclickBean(FindNewVersionPageUI.UPDATE_LATER);
        driver.sleep(500);
    }
}
