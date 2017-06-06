package com.personalDoc.pages;

import com.personalDoc.pageuis.SearchPageUI;
import com.personalDoc.utils.Config;
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

        //点键盘上右下角的确认
        if (Config.PLATFORM == "ios"){
            driver.onclickBean(SearchPageUI.SEARCH);
        }
        else if(Config.PLATFORM == "android"){
            driver.keys("\uE007");
        }

        //点击已搜索出的物品,进入商详
        driver.waitForElement(SearchPageUI.SOURCE_ITEM,100);
        driver.onclickBean(SearchPageUI.SOURCE_ITEM);
        driver.sleep(500);
    }

    public void firstSearch(String keywords) throws Exception{
        //点击搜索框
        driver.onclickBean(SearchPageUI.FIRST_SEARCH_BAR);
        driver.sleep(500);
        //输入
        driver.inputBean(SearchPageUI.FIRST_SEARCH_BAR, keywords);

        //点键盘上右下角的确认
        if (Config.PLATFORM == "ios"){
            driver.onclickBean(SearchPageUI.SEARCH);
        }
        else if(Config.PLATFORM == "android"){
            driver.keys("\uE007");
        }

        //点击已搜索出的物品,进入商详
        driver.waitForElement(SearchPageUI.SOURCE_ITEM,100);
        driver.onclickBean(SearchPageUI.SOURCE_ITEM);
        driver.sleep(500);
    }
}
