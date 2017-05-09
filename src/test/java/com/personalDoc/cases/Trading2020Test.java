package com.personalDoc.cases;

import com.personalDoc.pages.*;
import com.personalDoc.pageuis.*;
import macaca.client.common.GetElementWay;
import macaca.java.biz.ResultGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by chenjun on 17/4/25.
 */
public class Trading2020Test extends BaseTest {

    @Test
    //首页检查跳转搜索
    public void step1home() throws Exception {
        // 商城首页
        HomeListPage homeListPage = new HomeListPage("商城首页");
        homeListPage.setDriver(driver);
        driver.waitForElement(HomeListPageUI.MY_ORDER);
        if (homeListPage.hasPageShown(HomeListPageUI.MY_ORDER)) {
            saveScreen(homeListPage.pageDesc);
            ResultGenerator.loadPageSucc(homeListPage);
            // 上下滑动
            homeListPage.scroll();
            driver.sleep(1000);

            //点击搜索框
            homeListPage.onclickSearch();
        } else {
            // 商城首页没有加载成功
            ResultGenerator.loadPageFail(homeListPage);
//            Assert.fail("商城首页加载失败");
            return;
        }
    }

    @Test
    //搜索商品跳转商详
    public void step2search() throws Exception {
        // 商城搜索页
        SearchPage searchPage = new SearchPage("搜索页");
        searchPage.setDriver(driver);
        if (searchPage.hasPageShown(SearchPageUI.HOT_SEARCH)) {
            saveScreen(searchPage.pageDesc);
            ResultGenerator.loadPageSucc(searchPage);

            //点击搜索框
            searchPage.searchOneItem("冈本");
            driver.sleep(1000);
        } else {
            // 搜索页没有加载成功
            ResultGenerator.loadPageFail(searchPage);
            return;
        }
    }

    @Test
    public void step3itemDetail() throws Exception {
        // 商详页
        ProductDetailPage productDetailPage = new ProductDetailPage("商详页");
        productDetailPage.setDriver(driver);
        if (productDetailPage.hasPageShown(ProductDetailPageUI.PRODUCT_MAIN_PIC)) {
            saveScreen(productDetailPage.pageDesc);
            ResultGenerator.loadPageSucc(productDetailPage);

            //商详元素检查
            productDetailPage.detailCheck();
            //主图测试
            productDetailPage.cross();
            //上下滑动
//            homeListPage.scroll();
//            productDetailPage.scrollAgain();
            //点击"立即购买"
            productDetailPage.buy();
        } else {
            // 商详页没有加载成功
            ResultGenerator.loadPageFail(productDetailPage);
            return;
        }
    }

    @Test
    public void step4createOrder() throws Exception {
        // 订单填写页
        OrderFillPage orderFillPage = new OrderFillPage("订单填写页");
        orderFillPage.setDriver(driver);
        if (orderFillPage.hasPageShown(OrderFillPageUI.TITLE)) {
            saveScreen(orderFillPage.pageDesc);
            ResultGenerator.loadPageSucc(orderFillPage);
            //
            String discNameCommit = driver.getElement(GetElementWay.XPATH, "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]")
                    .getText();
            if (discNameCommit.equals("请添加收货地址")) {
                System.out.println("旭哥旭哥旭哥旭哥旭哥旭哥旭哥旭哥旭哥旭哥");
                // 新建地址页
                //点添加收货地址
                driver.onclickBean(OrderFillPageUI.ADD_ADDRESS);
                AddNewAddressPage addNewAddressPage = new AddNewAddressPage("新建地址页");
                addNewAddressPage.setDriver(driver);
                if (addNewAddressPage.hasPageShown(AddNewAddressPageUI.SAVE)) {
                    saveScreen(addNewAddressPage.pageDesc);
                    ResultGenerator.loadPageSucc(addNewAddressPage);
                    //
                    addNewAddressPage.addAddress();
                } else {
                    // 订单填写页没有加载成功
                    ResultGenerator.loadPageFail(addNewAddressPage);
                    return;
                }
            } else {
                // 已有地址
                System.out.println("+++++++++++++已有地址+++++++++++++");
                orderFillPage.submitOrder();
            }
        } else {
            // 订单填写页没有加载成功
            ResultGenerator.loadPageFail(orderFillPage);
            return;
        }
    }

    @Test
    public void step5pay() throws Exception {
        // 健康支付页
        PayPage payPage = new PayPage("健康支付页");
        payPage.setDriver(driver);
        if (payPage.hasPageShown(PayPageUI.TITLE)) {
            saveScreen(payPage.pageDesc);
            ResultGenerator.loadPageSucc(payPage);
            //
            payPage.pay();
        } else {
            // 订单填写页没有加载成功
            ResultGenerator.loadPageFail(payPage);
            return;
        }

        // 步步夺宝宝箱掉落页
        TreasureBoxPage treasureBoxPage = new TreasureBoxPage("健康支付页");
        treasureBoxPage.setDriver(driver);
        if (treasureBoxPage.hasPageShown(TreasureBoxPageUI.BOX_TEXT)) {
            saveScreen(treasureBoxPage.pageDesc);
            ResultGenerator.loadPageSucc(treasureBoxPage);
            //
            treasureBoxPage.boxCheck();
        } else {
            // 订单填写页没有加载成功
            ResultGenerator.loadPageFail(treasureBoxPage);
            return;
        }

        // 付款结果页
        PayResultPage payResultPage = new PayResultPage("付款结果页");
        payResultPage.setDriver(driver);
        if (treasureBoxPage.hasPageShown(PayResultPageUI.PAY_RLT)) {
            saveScreen(payResultPage.pageDesc);
            ResultGenerator.loadPageSucc(payResultPage);
            //订单详情
            payResultPage.payResultCheck();
            driver.onclickBean(PayResultPageUI.BACK_BTN);

            //关闭宝箱页
            driver.waitForElement(TreasureBoxPageUI.CLOSE_BTN);
            treasureBoxPage.boxCheck();
            //完成购买
            driver.onclickBean(PayResultPageUI.DONE);
            driver.sleep(1000);
            //返回商城首页
            String page = driver.source();
            Assert.assertEquals(true, page.contains("健康商城"));
        } else {
            // 付款结果页没有加载成功
            ResultGenerator.loadPageFail(payResultPage);
            return;
        }
    }
}