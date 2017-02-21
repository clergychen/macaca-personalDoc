package com.personalDoc.pages;

import com.alibaba.fastjson.JSONObject;
import com.personalDoc.pageuis.PayResultPageUI;
import macaca.java.biz.BasePage;
import org.junit.Assert;

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
        Assert.assertThat(page, containsString("收货人："));
        //底部检查
        Assert.assertThat(page, containsString("订单详情"));
        Assert.assertThat(page, containsString("完成购买"));
        Assert.assertThat(page, containsString("去购物车"));

        driver.onclickBean(PayResultPageUI.ORDER_DETAIL);
        driver.sleep(500);

        //订单详情页
        String page1 = driver.source();
        Assert.assertThat(page1, containsString("收货人："));
        Assert.assertThat(page1, containsString("支付方式:"));
        Assert.assertThat(page1, containsString("订单金额:"));
        Assert.assertThat(page1, containsString("运费:"));
        Assert.assertThat(page1, containsString("总价"));
        Assert.assertThat(page1, containsString("订单号:"));
        Assert.assertThat(page1, containsString("下单时间:"));
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
        int centerX = (int)windowWidth/2 - 10;
        int centerY = (int)windowHeight/2 + 70;

        driver.tap(centerX, centerY);
        driver.sleep(1000);
    }
}
