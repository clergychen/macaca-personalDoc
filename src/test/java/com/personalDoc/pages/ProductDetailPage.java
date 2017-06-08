package com.personalDoc.pages;

import com.alibaba.fastjson.JSONObject;
import com.personalDoc.pageuis.ProductDetailPageUI;
import com.personalDoc.utils.Config;
import macaca.java.biz.BasePage;
import org.testng.Assert;


import static org.hamcrest.Matchers.containsString;

/**
 * Created by chenjun on 17/2/13.
 */
public class ProductDetailPage extends BasePage{

    public ProductDetailPage(String pageDesc){
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void detailCheck() throws Exception{
        //页面元素展现检查
        String page = driver.source();
        //页头检查
        Assert.assertEquals(true,page.contains("商品详情"));

        //tab页检查
        Assert.assertEquals(true,page.contains("商品"));
        Assert.assertEquals(true,page.contains("详情"));
        //金额展示检查
        Assert.assertEquals(true,page.contains("￥"));
        //切换tab页
        if (Config.PLATFORM.equals("ios")) {
            driver.onclickBean(ProductDetailPageUI.TAB_DETAIL);
            driver.onclickBean(ProductDetailPageUI.TAB_PRODUCT);
        }else{
            JSONObject windowSize = driver.getWindowSize();
            int windowWidth = windowSize.getIntValue("width");
            int windowHeight = windowSize.getIntValue("height");
            int centerY = windowHeight / 2;
            driver.drag(windowWidth - 5, centerY, 30, centerY, 1);
            driver.sleep(500);
            driver.drag(30, centerY, windowWidth - 5, centerY, 1);
            driver.sleep(500);
        }

    }


    /**
     * 主图测试
     * @throws Exception
     */
    public void cross() throws Exception {

        //主图全屏
        driver.waitForElement(ProductDetailPageUI.PRODUCT_MAIN_PIC);
        driver.onclickBean(ProductDetailPageUI.PRODUCT_MAIN_PIC);
        driver.sleep(1500);
        driver.onclickBean(ProductDetailPageUI.PRODUCT_MAIN_PIC);
        //由于返回按钮偶现点穿的bug暂时注释掉
//        driver.back();
        driver.sleep(500);
        //主图左右滑动
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerY = windowHeight / 2;
        driver.drag(windowWidth - 500, centerY, 500, centerY, 1);
        driver.sleep(500);
        driver.drag(500, centerY, windowWidth - 500, centerY, 1);
        driver.sleep(500);
    }


    public void scrollAgain() throws Exception {
        //往下滑动
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = windowWidth / 2;
        driver.drag(centerX, windowHeight - 100, centerX, 100, 0.3);
    }

    public void buy() throws Exception{
        // 立即购买
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = windowWidth - 10;
        int centerY = windowHeight - 10;

        driver.tap(centerX, centerY);
        driver.sleep(1000);
    }

    public void buyByName() throws Exception{
        driver.waitForElement(ProductDetailPageUI.BUY);
        driver.onclickBean(ProductDetailPageUI.BUY);
    }

    public void addToCart() throws Exception{
        // 点加入购物车
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = windowWidth /2;
        int centerY = windowHeight - 10;

        driver.tap(centerX, centerY);
        driver.sleep(500);
    }

    public void Cart() throws Exception{
        // 点购物车
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = windowWidth /4;
        int centerY = windowHeight - 10;

        driver.tap(centerX, centerY);
        driver.sleep(500);
    }
}
