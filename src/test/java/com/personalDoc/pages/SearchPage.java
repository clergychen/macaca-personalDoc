package com.personalDoc.pages;

import com.personalDoc.pageuis.SearchPageUI;
import macaca.client.commands.Element;
import macaca.java.biz.BasePage;

/**
 * Created by chenjun on 17/2/8.
 */
public class SearchPage extends BasePage{

    public SearchPage(String pageDesc) {
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void searchOneItem(String keywords) throws Exception{

        //点击搜索框
        driver.onclickBean(SearchPageUI.SEARCH_BAR);
        driver.sleep(500);
        //输入
        driver.inputBean(SearchPageUI.SEARCH_BAR, keywords);
        driver.sleep(1000);
        //点击已搜索出的物品
        driver.waitForElement(SearchPageUI.GANG_BEN);
        driver.onclickBean(SearchPageUI.GANG_BEN);
        driver.sleep(500);
        //点击item进入商详
        driver.onclickBean(SearchPageUI.ITEM_1);
        driver.sleep(500);

//        Element element = driver.waitForElement(SearchPageUI.SEARCH_BAR);
//        element.click();
    }



}
