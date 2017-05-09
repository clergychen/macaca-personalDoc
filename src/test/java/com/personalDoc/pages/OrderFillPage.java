package com.personalDoc.pages;

import com.personalDoc.pageuis.OrderFillPageUI;
import macaca.java.biz.BasePage;
import org.testng.Assert;


import static org.hamcrest.Matchers.containsString;

/**
 * Created by chenjun on 17/2/16.
 */
public class OrderFillPage extends BasePage {

    public OrderFillPage(String pageDesc){
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void pageCheck() throws Exception {
        //页面元素展现检查
        String page = driver.source();
        //
        Assert.assertEquals(true,page.contains("订单填写"));
        //底部检查
        Assert.assertEquals(true,page.contains("应付总额"));
        Assert.assertEquals(true,page.contains("提交订单"));
        driver.onclickBean(OrderFillPageUI.SUBMIT_ORDER);
    }

    public void submitOrder() throws Exception {
        //页面元素展现检查
        String page = driver.source();
        //页头检查
        Assert.assertEquals(true,page.contains("支付方式"));
        //底部检查
        Assert.assertEquals(true,page.contains("应付总额"));
        Assert.assertEquals(true,page.contains("提交订单"));
        //请添加收货地址
        driver.onclickBean(OrderFillPageUI.SUBMIT_ORDER);
        driver.sleep(1000);
    }
}
