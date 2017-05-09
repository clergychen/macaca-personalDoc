package com.personalDoc.cases;

import com.personalDoc.pages.*;
import com.personalDoc.pageuis.*;
import macaca.client.common.GetElementWay;
import macaca.java.biz.ResultGenerator;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.hamcrest.Matchers.containsString;

/**
 * Created by chenjun on 17/1/10.
 */
public class AppCoverInstallTest extends BaseTest {

//    @Test(groups = "functest")
    @Test
    //准备工作跳转商城
    public void testMethod1() throws Exception {
        // 任意门
        AnyDoorPage anyDoorPage = new AnyDoorPage("任意门Alert");
        anyDoorPage.setDriver(driver);
        if (anyDoorPage.hasPageShown(AnyDoorPageUI.ANY_DOOR)) {
            saveScreen(anyDoorPage.pageDesc);
            ResultGenerator.loadPageSucc(anyDoorPage);
            //
            anyDoorPage.leaveMe();
        }

        // 顶通页
        DingTongPage dingtongPage = new DingTongPage("顶通页");
        dingtongPage.setDriver(driver);
        if (dingtongPage.hasPageShown(DingTongPageUI.DINGTONG_BACK)) {
            saveScreen(dingtongPage.pageDesc);
            ResultGenerator.loadPageSucc(dingtongPage);
            //
            dingtongPage.dingtong();
        }

        // 发现新版本页
        FindNewVersionPage findNewVersionPage = new FindNewVersionPage("发现新版本页");
        findNewVersionPage.setDriver(driver);
        if (findNewVersionPage.hasPageShown(FindNewVersionPageUI.UPDATETIP_PAGE)) {
            saveScreen(findNewVersionPage.pageDesc);
            ResultGenerator.loadPageSucc(findNewVersionPage);
            //
            findNewVersionPage.updateLater();
        } else {
            ResultGenerator.loadPageFail(findNewVersionPage);
        }

        // 主客首页
        ZhuKeHomePage zhukehomePage = new ZhuKeHomePage("主客首页");
        zhukehomePage.setDriver(driver);
        if (zhukehomePage.hasPageShown(ZhuKeHomePageUI.MALL_TAB)) {
            driver.waitForElement(ZhuKeHomePageUI.ME);
            saveScreen(zhukehomePage.pageDesc);
            ResultGenerator.loadPageSucc(zhukehomePage);
            // 进入商城首页
            zhukehomePage.tabMall();
            driver.sleep(5000);
        } else {
            // 首页没有加载成功，后面的用例都不用执行了，return
            ResultGenerator.loadPageFail(zhukehomePage);
            Assert.fail();
            return;
        }
    }

    @Test
//    @Test(groups = {"functest", "checkintest"})
    //首页检查跳转搜索
    public void testMethod2() throws Exception {
        // 商城首页
        HomeListPage homeListPage = new HomeListPage("商城首页");
        homeListPage.setDriver(driver);
//        if (homeListPage.hasPageShown(HomeListPageUI.MY_ORDER)&&homeListPage.hasPageShown(HomeListPageUI.SEARCH)) {
        if (homeListPage.hasPageShown(HomeListPageUI.MY_ORDER)) {

            saveScreen(homeListPage.pageDesc);
            ResultGenerator.loadPageSucc(homeListPage);
            // 上下滑动
            homeListPage.scroll();
            driver.sleep(1000);

            //点击搜索框
            homeListPage.onclickSearch();
            driver.waitForElement(SearchPageUI.HOT_SEARCH);
        } else {
            // 商城首页没有加载成功
            ResultGenerator.loadPageFail(homeListPage);
            Assert.fail("商城首页加载失败");
            return;
        }
    }

    @Test
//    @Test(dependsOnMethods = {"testMethod2"},groups = {"functest"})
    //搜索商品跳转商详
    public void testMethod3() throws Exception {
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
//    @Test(dependsOnMethods = {"testMethod3"})
    public void itemDetail() throws Exception {
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
//    @Test(dependsOnMethods = {"itemDetail"})
    public void createOrder() throws Exception {
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
//    @Test(dependsOnMethods = {"createOrder"})
    public void pay() throws Exception {
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
//            //点击客服咨询按钮
//            payResultPage.kfzx();
//            //判断是否弹出客服咨询alert框
//            Calendar now = Calendar.getInstance();
//            // 截取当前时间时分秒
//            int strDateH = now.get(Calendar.HOUR_OF_DAY);
//            int strDateM = now.get(Calendar.MINUTE);
//            int strDateS = now.get(Calendar.SECOND);
//            System.out.println("时" + strDateH);
//            System.out.println("分" + strDateM);
//            System.out.println("秒" + strDateS);
//            // 开始时间时分秒
//            int strDateBeginH = 9;
//            int strDateBeginM = 0;
//            int strDateBeginS = 0;
//            // 结束时间时分秒
//            int strDateEndH = 23;
//            int strDateEndM = 0;
//            int strDateEndS = 0;
//
//            if ((strDateH >= strDateBeginH && strDateH <= strDateEndH)) {
//                // 当前时间小时数在开始时间和结束时间小时数之间
//                if (strDateH > strDateBeginH && strDateH < strDateEndH) {
//                    //客服咨询返回
//                    payResultPage.endLine();
//                    // 当前时间小时数等于开始时间小时数，分钟数在开始和结束之间
//                } else if (strDateH == strDateBeginH && strDateM >= strDateBeginM && strDateM <= strDateEndM) {
//                    payResultPage.endLine();
//                    // 当前时间小时数等于开始时间小时数，分钟数等于开始时间分钟数，秒数在开始和结束之间
//                } else if (strDateH == strDateBeginH && strDateM == strDateBeginM && strDateS >= strDateBeginS && strDateS <= strDateEndS) {
//                    payResultPage.endLine();
//                }
//                // 当前时间小时数大等于开始时间小时数，等于结束时间小时数，分钟数小等于结束时间分钟数
//                else if (strDateH >= strDateBeginH && strDateH == strDateEndH && strDateM <= strDateEndM) {
//                    payResultPage.endLine();
//                    // 当前时间小时数大等于开始时间小时数，等于结束时间小时数，分钟数等于结束时间分钟数，秒数小等于结束时间秒数
//                } else if (strDateH >= strDateBeginH && strDateH == strDateEndH && strDateM == strDateEndM && strDateS <= strDateEndS) {
//                    payResultPage.endLine();
//                } else {
//                    return;
//                }
//            } else {
//                return;
//            }
//            //回到付款结果页
//            driver.onclickBean(PayResultPageUI.KFZX_BACK);
//            //
//            driver.onclickBean(TreasureBoxPageUI.CLOSE_BTN);
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

//    public class NewTest {
//        @Test(dataProvider = "dp")
//        public void f(Integer n, String s) {
//            System.out.println("第一个参数是" + n + ",第二个参数是" + s);
//        }
//
//        @DataProvider
//        public Object[][] dp() {
//            return new Object[][]{
//                    new Object[]{1, "a"},
//                    new Object[]{2, "b"},
//            };
//        }
//
//        @BeforeTest
//        public void beforeTest() {
//            System.out.println("------------开始测试------------");
//        }
//
//        @AfterTest
//        public void afterTest() {
//            System.out.println("------------结束测试------------");
//        }
//
//    }
}
