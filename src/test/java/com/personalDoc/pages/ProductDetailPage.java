package com.personalDoc.pages;

import com.alibaba.fastjson.JSONObject;
import com.personalDoc.pageuis.ProductDetailPageUI;
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
        driver.onclickBean(ProductDetailPageUI.TAB_DETAIL);
        driver.onclickBean(ProductDetailPageUI.TAB_PRODUCT);
    }


    /**
     * 主图测试
     * @throws Exception
     */
    public void cross() throws Exception {

        //主图全屏
        driver.onclickBean(ProductDetailPageUI.PRODUCT_MAIN_PIC);
        driver.sleep(500);
        driver.onclickBean(ProductDetailPageUI.BACK);
        //主图左右滑动
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerY = windowHeight / 2;
        driver.drag(windowWidth - 35, centerY, 35, centerY, 0.3, 10);
        driver.sleep(500);
        driver.drag(35, centerY, windowWidth - 35, centerY, 0.3, 10);

    }


    public void scrollAgain() throws Exception {
        //往下滑动
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = windowWidth / 2;
        driver.drag(centerX, windowHeight - 100, centerX, 100, 0.3, 100);
    }

    public void addToCart() throws Exception{
        // 点加入购物车
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = windowWidth /2;
        int centerY = windowHeight - 10;

        driver.tap(centerX, centerY);
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
}
