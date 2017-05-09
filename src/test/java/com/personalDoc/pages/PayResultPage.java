package com.personalDoc.pages;

import com.alibaba.fastjson.JSONObject;
import com.personalDoc.pageuis.PayResultPageUI;
import macaca.java.biz.BasePage;
import org.testng.Assert;


import static org.hamcrest.Matchers.containsString;

/**
 * Created by chenjun on 17/2/20.
 */
public class PayResultPage extends BasePage {

    public PayResultPage(String pageDesc){
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void payResultCheck() throws Exception {
        //页面元素展现检查
        String page = driver.source();
        //页头检查
        Assert.assertEquals(true,page.contains("收货人："));
        //底部检查
        Assert.assertEquals(true,page.contains("订单详情"));
        Assert.assertEquals(true,page.contains("完成购买"));
        Assert.assertEquals(true,page.contains("去购物车"));

        driver.onclickBean(PayResultPageUI.ORDER_DETAIL);
        driver.sleep(500);

        //订单详情页
        String pageV = driver.source();
        Assert.assertEquals(true,pageV.contains("收货人："));
        Assert.assertEquals(true,pageV.contains("支付方式:"));
        Assert.assertEquals(true,pageV.contains("订单金额:"));
        Assert.assertEquals(true,pageV.contains("运费:"));
        Assert.assertEquals(true,pageV.contains("总价"));
        Assert.assertEquals(true,pageV.contains("订单号:"));
        Assert.assertEquals(true,pageV.contains("下单时间:"));
    }

    public  void kfzx() throws  Exception {
        //点击客服咨询按钮
        driver.onclickBean(PayResultPageUI.KFZX);
        driver.sleep(500);
        driver.onclickBean(PayResultPageUI.KFZX_BACK);
    }

    public void endLine() throws Exception {
        // 结束排队
        JSONObject windowSize = driver.getWindowSize();
        int windowWidth = windowSize.getIntValue("width");
        int windowHeight = windowSize.getIntValue("height");
        int centerX = windowWidth /2 - 10;
        int centerY = windowHeight /2 + 70;

        driver.tap(centerX, centerY);
        driver.sleep(1000);
    }
}
