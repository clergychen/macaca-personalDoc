package com.personalDoc.pages;

import com.personalDoc.pageuis.TreasureBoxPageUI;
import macaca.java.biz.BasePage;


/**
 * Created by chenjun on 17/2/20.
 */
public class TreasureBoxPage extends BasePage {

    public TreasureBoxPage(String pageDesc){
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void boxCheck() throws Exception {
        driver.onclickBean(TreasureBoxPageUI.CLOSE_BTN);
    }
}
