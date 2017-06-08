package com.personalDoc.pages;

import com.personalDoc.pageuis.AddNewAddressPageUI;
import macaca.java.biz.BasePage;
import org.testng.Assert;

import static org.hamcrest.Matchers.containsString;

/**
 * Created by chenjun on 17/2/17.
 */
public class AddNewAddressPage extends BasePage {

    public AddNewAddressPage(String pageDesc){
        super(pageDesc);
        // TODO Auto-generated constructor stub
    }

    public void addAddress() throws Exception {
        //页面元素展现检查
        String page = driver.source();
        Assert.assertEquals(true,page.contains("新建地址"));
        Assert.assertEquals(true,page.contains("收货人"));
        Assert.assertEquals(true,page.contains("手机号码"));
        Assert.assertEquals(true,page.contains("所在地区"));
        Assert.assertEquals(true,page.contains("收货地址"));
        Assert.assertEquals(true,page.contains("保存"));

        //填写收货人
        driver.onclickBean(AddNewAddressPageUI.CONSIGNEE);
        driver.inputBean(AddNewAddressPageUI.CONSIGNEE,"uitest");
        //填写手机号码
        driver.onclickBean(AddNewAddressPageUI.CELL_NUM);
        driver.inputBean(AddNewAddressPageUI.CELL_NUM,"13564444444");
        //填写所在地区
        driver.onclickBean(AddNewAddressPageUI.LOCATION);
        driver.onclickBean(AddNewAddressPageUI.SH);
        driver.sleep(500);
        driver.onclickBean(AddNewAddressPageUI.SH);
        driver.onclickBean(AddNewAddressPageUI.HUANG_PU);
        //填写收货地址
        driver.inputBean(AddNewAddressPageUI.REC_ADDRESS,"世纪大道1号");
        //
        driver.onclickBean(AddNewAddressPageUI.SAVE);
    }

}
