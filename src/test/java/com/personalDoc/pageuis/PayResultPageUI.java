package com.personalDoc.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by chenjun on 17/2/20.
 */
public class PayResultPageUI extends BasePageUI {
    //付款结果页
    //返回
    public static final CommonUIBean BACK_BTN = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"id_system_icon_back",
            "id_system_icon_back");
    //付款结果
    public static final CommonUIBean PAY_RLT = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"付款结果",
            "付款结果");
    //付款成功
    public static final CommonUIBean PAY_SUCC = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"付款成功",
            "付款成功");
    //收货人：
    public static final CommonUIBean BUYER = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"收货人：",
            "收货人：");
    //订单详情
    public static final CommonUIBean ORDER_DETAIL = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"订单详情",
            "订单详情");
    //完成购买
    public static final CommonUIBean DONE = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"完成购买",
            "完成购买");
    //去购物车
    public static final CommonUIBean GOTO_CART = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"去购物车",
            "去购物车");
    //订单详情页
    //客服咨询
    public static final CommonUIBean KFZX = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"客服咨询",
            "客服咨询");
    public static final CommonUIBean KFZX_BACK = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"id_system_icon_back",
            "id_system_icon_back");

    //自助服务
    public static final CommonUIBean ZZFW = new CommonUIBean(
            GetElementWay.ID, "android_value",
            GetElementWay.NAME,"自助服务",
            "自助服务");

}
